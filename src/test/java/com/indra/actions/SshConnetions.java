package com.indra.actions;

import com.jcraft.jsch.*;

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







}
