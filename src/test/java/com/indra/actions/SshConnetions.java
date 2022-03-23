package com.indra.actions;

import com.jcraft.jsch.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SshConnetions {

    public void connectionSSH(String host,String user,String password) throws JSchException {
        String localPath = "/src/test/resources/config_data";
        String fileName =  "ShoppingBag.log";
        String sftpPath = "/usr/local/jboss-portal-2.7.1/server/default/log";
        String sftpHost = host;
        String sftpPort = "22";
        String sftpUser = user;
        String sftpPassword = password;

        try{
            /**
             * Open session to sftp server
             */
            JSch jsch = new JSch();
            Session session = jsch.getSession(sftpUser, sftpHost, Integer.valueOf(sftpPort));
            session.setConfig("StrictHostKeyChecking", "no");
            session.setPassword(sftpPassword);
            System.out.println("Connecting------");
            session.connect();
            System.out.println("Established Session");

            Channel channel = session.openChannel("sftp");
            ChannelSftp sftpChannel = (ChannelSftp) channel;
            sftpChannel.connect();

            System.out.println("Opened sftp Channel");

            /**
             * Do everything you need in sftp
             */
            /**System.out.println("Copying file to Host");
             sftpChannel.put(localPath+"/"+fileName, sftpPath);
             System.out.println("Copied file to Host");*/

            System.out.println("Copying file from Host to Local");
            sftpChannel.get(sftpPath + "/" + fileName, localPath);
            System.out.println("Copied file from Host to local");

            sftpChannel.disconnect();
            session.disconnect();

            System.out.println("Disconnected from sftp");
        }
        catch (Exception e){
            e.printStackTrace();

        }
    }

    private Session session;

    public void connectionSSH1(String host,String user,String password) throws JSchException, IllegalAccessException {
        if (this.session == null || !this.session.isConnected()) {
            JSch jsch = new JSch();

            String sftpPort = "22";
            this.session = jsch.getSession(user, host, Integer.parseInt(sftpPort));
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

            //Ejecutamos el comando.
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
                //System.out.println("comando no ejecutado");
                System.out.println(linea);
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
