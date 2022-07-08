package com.indra.actions;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ShellConnections {

    private Session session;

    public void connectionSSH(String host,String user,String password) throws JSchException, IllegalAccessException {
        if (this.session == null || !this.session.isConnected()) {
            JSch jsch = new JSch();

            this.session = jsch.getSession(user, host);
            this.session.setPassword(password);

            // Parametro para no validar key de conexion.
            this.session.setConfig("StrictHostKeyChecking", "no");

            this.session.connect();
            System.out.println("conexion iniciada");
        } else {
            throw new IllegalAccessException("Sesion SSH ya iniciada.");
        }
    }


    public final String executeCommand(String command)
            throws JSchException, IOException, IllegalAccessException {
        if (this.session != null && this.session.isConnected()) {

            // Abrimos un canal SSH. Es como abrir una consola.
            ChannelExec channelExec = (ChannelExec) this.session.
                    openChannel("exec");

            InputStream in = channelExec.getInputStream();

            // Ejecutamos el comando.
            channelExec.setCommand(command);
            channelExec.connect();
            System.out.println("comando ejecutado");

            // Obtenemos el texto impreso en la consola.
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder builder = new StringBuilder();
            String linea;
            System.out.println("comando no logro ejecucion");

            while ((linea = reader.readLine()) != null) {
                builder.append(linea);
                System.out.println("comando no ejecutado");
            }

            // Cerramos el canal SSH.
            channelExec.disconnect();

            // Retornamos el texto impreso en la consola.
            return builder.toString();
        } else {
            throw new IllegalAccessException("No existe sesion SSH iniciada.");
        }
    }

    /**
     * Cierra la sesión SSH.
     */
    public final void disconnect() {
        this.session.disconnect();
    }
}