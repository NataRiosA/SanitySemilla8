package com.indra.models;

import com.indra.actions.ReadFileXLSXActions;

public class DataExcelModels{

    ReadFileXLSXActions fileXLSX = new ReadFileXLSXActions();

    String clientNit;
    String msisdnNintendoNit;
    String msiNintendoNit;
    String CedulaClienteNinNit;
    String urlEpos;
    String urlCRM;
    String urlComfirmador;
    String urlGatewayCBS;
    String urlGatewayMG;
    String MSISDN;
    String Plu;
    String Serial;
    String urlDBA;
    String serviceA;
    String userA;
    String passwordA;
    String urlDBE;
    String serviceE;
    String userE;
    String passwordE;
    String urlDBS;
    String serviceS;
    String userS;
    String passwordS;
    String urlDBP;
    String serviceP;
    String userP;
    String passwordP;
    String port;

    String vendedorPrepago;
    String cedulaClientePrepago;
    String msisdnPrepago;
    String msiPrepago;

    String VendedorPostpago;
    String CedulaClientePostpago;
    String msisdnPostpago;
    String msiPostpago;

    String msisdnAvanger;
    String msiAvanger;
    String CedulaClienteAvanger;

    String Winwap;
    String PortabilitySoapUI;
    String user;
    String password;

    String msisdnPort;
    String nip;
    String msiPort;
    String msisdnPort1;
    String msiPort1;
    String clientPort;
    String portId;

    String msisdnPortPrepay;
    String msiPortPrepay;

    String hostSSH;
    String userSSh;
    String passwordSSH;
    String msisdnForPorting;
    String msiForPorting;

    String msisdnForPorting2;
    String msiForPorting2;

    public String getMsisdnForPorting2() {
        fileXLSX.readFileExcel();
        msisdnForPorting2=fileXLSX.excelArray.get(11).get(2);
        return msisdnForPorting2;
    }

    public String getMsiForPorting2() {
        fileXLSX.readFileExcel();
        msiForPorting2=fileXLSX.excelArray.get(11).get(3);
        return msiForPorting2;
    }

    public String getMsisdnForPorting() {
        fileXLSX.readFileExcel();
        msisdnForPorting=fileXLSX.excelArray.get(11).get(2);
        return msisdnForPorting;
    }

    public String getMsiForPorting() {
        fileXLSX.readFileExcel();
        msiForPorting=fileXLSX.excelArray.get(11).get(3);
        return msiForPorting;
    }

    public String getVendedorPrepago() {
        fileXLSX.readFileExcel();
        vendedorPrepago = fileXLSX.excelArray.get(8).get(0);
        return vendedorPrepago;
    }

    public String getCedulaClientePrepago() {
        fileXLSX.readFileExcel();
        cedulaClientePrepago = fileXLSX.excelArray.get(8).get(1);
        return cedulaClientePrepago;
    }

    public String getMsisdnPrepago() {
        fileXLSX.readFileExcel();
        msisdnPrepago = fileXLSX.excelArray.get(8).get(2);
        return msisdnPrepago;
    }

    public String getMsiPrepago() {
        fileXLSX.readFileExcel();
        msiPrepago = fileXLSX.excelArray.get(8).get(3);
        return msiPrepago;
    }

    public String getVendedorPostpago() {
        fileXLSX.readFileExcel();
        VendedorPostpago = fileXLSX.excelArray.get(9).get(0);
        return VendedorPostpago;
    }

    public String getCedulaClientePostpago() {
        fileXLSX.readFileExcel();
        CedulaClientePostpago = fileXLSX.excelArray.get(9).get(1);
        return CedulaClientePostpago;
    }

    public String getMsisdnPostpago() {
        fileXLSX.readFileExcel();
        msisdnPostpago = fileXLSX.excelArray.get(9).get(2);
        return msisdnPostpago;
    }

    public String getMsiPostpago() {
        fileXLSX.readFileExcel();
        msiPostpago = fileXLSX.excelArray.get(9).get(3);
        return msiPostpago;
    }

    public String getUrlEpos() {
        fileXLSX.readFileExcel();
        urlEpos = fileXLSX.excelArray.get(1).get(0);
        return urlEpos;
    }

    public String getUrlCRM() {
        fileXLSX.readFileExcel();
        urlCRM = fileXLSX.excelArray.get(1).get(1);
        return urlCRM;
    }

    public String getUrlComfirmador() {
        fileXLSX.readFileExcel();
        urlComfirmador = fileXLSX.excelArray.get(1).get(2);
        return urlComfirmador;
    }

    public String getUrlGatewayCBS() {
        fileXLSX.readFileExcel();
        urlGatewayCBS = fileXLSX.excelArray.get(1).get(3);
        return urlGatewayCBS;
    }

    public String getUrlGatewayMG() {
        fileXLSX.readFileExcel();
        urlGatewayMG = fileXLSX.excelArray.get(1).get(4);
        return urlGatewayMG;
    }

    public String getMSISDN() {
        fileXLSX.readFileExcel();
        MSISDN = fileXLSX.excelArray.get(10).get(2);
        return MSISDN;
    }

    public String getPlu() {
        return Plu;
    }

    public String getSerial() {
        return Serial;
    }

    public String getUrlDBA() {
        fileXLSX.readFileExcel();
        urlDBA = fileXLSX.excelArray.get(3).get(0);
        return urlDBA;
    }

    public String getServiceA() {
        fileXLSX.readFileExcel();
        serviceA = fileXLSX.excelArray.get(3).get(1);
        return serviceA;
    }

    public String getUserA() {
        fileXLSX.readFileExcel();
        userA = fileXLSX.excelArray.get(3).get(2);
        return userA;
    }

    public String getPasswordA() {
        fileXLSX.readFileExcel();
        passwordA = fileXLSX.excelArray.get(3).get(3);
        return passwordA;
    }

    public String getUrlDBE() {
        fileXLSX.readFileExcel();
        urlDBE = fileXLSX.excelArray.get(4).get(0);
        return urlDBE;
    }

    public String getServiceE() {
        fileXLSX.readFileExcel();
        serviceE = fileXLSX.excelArray.get(4).get(1);
        return serviceE;
    }

    public String getUserE() {
        fileXLSX.readFileExcel();
        userE = fileXLSX.excelArray.get(4).get(2);
        return userE;
    }

    public String getPasswordE() {
        fileXLSX.readFileExcel();
        passwordE = fileXLSX.excelArray.get(4).get(3);
        return passwordE;
    }

    public String getUrlDBS() {
        fileXLSX.readFileExcel();
        urlDBS = fileXLSX.excelArray.get(6).get(0);
        return urlDBS;
    }

    public String getServiceS() {
        fileXLSX.readFileExcel();
        serviceS = fileXLSX.excelArray.get(6).get(1);
        return serviceS;
    }

    public String getUserS() {
        fileXLSX.readFileExcel();
        userS = fileXLSX.excelArray.get(6).get(2);
        return userS;
    }

    public String getPasswordS() {
        fileXLSX.readFileExcel();
        passwordS = fileXLSX.excelArray.get(6).get(3);
        return passwordS;
    }

    public String getUrlDBP() {
        fileXLSX.readFileExcel();
        urlDBP = fileXLSX.excelArray.get(5).get(0);
        return urlDBP;
    }

    public String getServiceP() {
        fileXLSX.readFileExcel();
        serviceP = fileXLSX.excelArray.get(5).get(1);
        return serviceP;
    }

    public String getUserP() {
        fileXLSX.readFileExcel();
        userP = fileXLSX.excelArray.get(5).get(2);
        return userP;
    }

    public String getPasswordP() {
        fileXLSX.readFileExcel();
        passwordP = fileXLSX.excelArray.get(5).get(3);
        return passwordP;
    }

    public String getPort() {
        port = "1521";
        return port;
    }


    public String getWinwap() {
        fileXLSX.readFileExcel();
        Winwap = fileXLSX.excelArray.get(1).get(7);
        return Winwap;
    }

    public String getPortabilitySoapUI() {
        fileXLSX.readFileExcel();
        PortabilitySoapUI = fileXLSX.excelArray.get(1).get(8);
        return PortabilitySoapUI;
    }


    public String getUser() {
        fileXLSX.readFileExcel();
        user = fileXLSX.excelArray.get(1).get(5);
        return user;
    }

    public String getPassword() {
        fileXLSX.readFileExcel();
        password = fileXLSX.excelArray.get(1).get(6);
        return password;
    }

    public String getMsisdnAvanger() {
        fileXLSX.readFileExcel();
        msisdnAvanger = fileXLSX.excelArray.get(13).get(2);
        return msisdnAvanger;
    }

    public String getMsiAvanger() {
        fileXLSX.readFileExcel();
        msiAvanger = fileXLSX.excelArray.get(13).get(3);
        return msiAvanger;
    }

    public String getCedulaClienteAvanger() {
        fileXLSX.readFileExcel();
        CedulaClienteAvanger = fileXLSX.excelArray.get(13).get(1);
        return CedulaClienteAvanger;
    }

    public String getMsisdnPort() {
        fileXLSX.readFileExcel();
        msisdnPort = fileXLSX.excelArray.get(9).get(4) ;
        return msisdnPort;
    }

    public String getMsisdnPort1() {
        fileXLSX.readFileExcel();
        msisdnPort1 = fileXLSX.excelArray.get(8).get(4) ;
        return msisdnPort1;
    }

    public String getMsiPort1() {
        fileXLSX.readFileExcel();
        msiPort1 = fileXLSX.excelArray.get(8).get(5);
        return msiPort1;
    }

    public String getNip() {
        fileXLSX.readFileExcel();
        nip = fileXLSX.excelArray.get(8).get(6);
        return nip;
    }

    public String getMsiPort() {
        fileXLSX.readFileExcel();
        msiPort = fileXLSX.excelArray.get(9).get(5);
        return msiPort;
    }

    public String getClientPort() {
        fileXLSX.readFileExcel();
        clientPort = fileXLSX.excelArray.get(8).get(7);
        return clientPort;
    }

    public String getPortId() {
        fileXLSX.readFileExcel();
        portId = fileXLSX.excelArray.get(8).get(8);
        return portId;
    }

    public String getMsisdnPortPrepay() {
        fileXLSX.readFileExcel();
        msisdnPortPrepay = fileXLSX.excelArray.get(9).get(4);
        return msisdnPortPrepay;
    }

    public String getMsiPortPrepay() {
        fileXLSX.readFileExcel();
        msisdnPortPrepay = fileXLSX.excelArray.get(9).get(5);
        return msiPortPrepay;
    }

    public String getHostSSH() {
        fileXLSX.readFileExcel();
        hostSSH = fileXLSX.excelArray.get(4).get(4);
        return hostSSH;
    }

    public String getUserSSh() {
        fileXLSX.readFileExcel();
        userSSh= fileXLSX.excelArray.get(4).get(5);
        return userSSh;
    }

    public String getPasswordSSH() {
        fileXLSX.readFileExcel();
        passwordSSH= fileXLSX.excelArray.get(4).get(6);
        return passwordSSH;
    }

    public String getMsisdnNintendoNit() {
        fileXLSX.readFileExcel();
        msisdnNintendoNit = fileXLSX.excelArray.get(15).get(2);
        return msisdnNintendoNit;
    }

    public String getMsiNintendoNit() {
        fileXLSX.readFileExcel();
        msiNintendoNit = fileXLSX.excelArray.get(15).get(3);
        return msiNintendoNit;
    }

    public String getCedulaClienteNinNit() {
        fileXLSX.readFileExcel();
        CedulaClienteNinNit = fileXLSX.excelArray.get(15).get(1);
        return CedulaClienteNinNit;
    }

    public String getClientNit() {
        fileXLSX.readFileExcel();
        clientNit = fileXLSX.excelArray.get(12).get(4);
        return clientNit;
    }
}