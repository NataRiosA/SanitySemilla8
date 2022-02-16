package com.indra.actions;

import com.indra.models.DataExcelModels;
import com.indra.models.WindexModels;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class InventoryConfirmActions extends DataExcelModels {

    public String resultExecuteActivation(int resultActivation) {
        if (resultActivation == 1) {
            return "Activacion de Invetario Finalizada";
        }
        return "Activacion Fallida";
    }

    public int executeStepsActivation()
            throws InterruptedException, IOException, AWTException {

        Process proceso = Runtime.getRuntime().exec(getWinwap());
        Thread.sleep(2000);
        confirmInventory(getUser(), getPassword(), getUrlComfirmador());
        proceso.destroy();
        proceso.waitFor();
        return proceso.exitValue();
    }

    public void confirmInventory(String user, String password, String url) throws AWTException, InterruptedException {
        Robot robot = new Robot();

        Thread.sleep(5000);

        write(url);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(500);
        }

        write(user);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        write(password);
        robot.keyRelease(KeyEvent.VK_TAB);

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);

        for (int i = 0; i < 8; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(500);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000);

        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(500);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
    }


    public static void write(String texto) {
        try {
            Robot robot = new Robot();
            char[] textoarray = texto.toCharArray();

            for (int i = 0; i < texto.length(); ++i) {
                String letra = Character.toString(textoarray[i]);
                if (Character.isUpperCase(textoarray[i])) {
                    robot.keyPress(16);
                } else {
                    robot.keyRelease(16);
                }

                int k;
                int numpad_kc;
                switch (letra.hashCode()) {
                    case 32:
                        if (letra.equals(" ")) {
                            robot.keyPress(32);
                        }
                        break;

                    case 58:
                        if (letra.equals(":")) {
                            robot.keyPress(18);

                            for (k = 3; k >= 0; --k) {
                                numpad_kc = 58 / (int) Math.pow(10.0D,
                                        (double) k) % 10 + 96;
                                robot.keyPress(numpad_kc);
                                robot.keyRelease(numpad_kc);
                            }

                            robot.keyRelease(18);
                        }
                        break;
                    case 47:
                        if (letra.equals("/")) {
                            robot.keyPress(18);

                            for (k = 3; k >= 0; --k) {
                                numpad_kc = 47 / (int) Math.pow(10.0D,
                                        (double) k) % 10 + 96;
                                robot.keyPress(numpad_kc);
                                robot.keyRelease(numpad_kc);
                            }

                            robot.keyRelease(18);
                        }
                        break;

                    case 45:
                        if (letra.equals("-")) {
                            robot.keyPress(18);

                            for (k = 3; k >= 0; --k) {
                                numpad_kc = 45 / (int) Math.pow(10.0D,
                                        (double) k) % 10 + 96;
                                robot.keyPress(numpad_kc);
                                robot.keyRelease(numpad_kc);
                            }

                            robot.keyRelease(18);
                        }
                        break;


                    case 46:
                        if (letra.equals(".")) {
                            robot.keyPress(18);

                            for (k = 3; k >= 0; --k) {
                                numpad_kc = 46 / (int) Math.pow(10.0D,
                                        (double) k) % 10 + 96;
                                robot.keyPress(numpad_kc);
                                robot.keyRelease(numpad_kc);
                            }

                            robot.keyRelease(18);
                        }
                        break;
                    case 48:
                        if (letra.equals("0")) {
                            robot.keyPress(48);
                            robot.keyRelease(48);
                        }
                        break;
                    case 49:
                        if (letra.equals("1")) {
                            robot.keyPress(49);
                            robot.keyRelease(49);
                        }
                        break;
                    case 50:
                        if (letra.equals("2")) {
                            robot.keyPress(50);
                            robot.keyRelease(50);
                        }
                        break;
                    case 51:
                        if (letra.equals("3")) {
                            robot.keyPress(51);
                            robot.keyRelease(51);
                        }
                        break;
                    case 52:
                        if (letra.equals("4")) {
                            robot.keyPress(52);
                            robot.keyRelease(52);
                        }
                        break;
                    case 53:
                        if (letra.equals("5")) {
                            robot.keyPress(53);
                            robot.keyRelease(53);
                        }
                        break;
                    case 54:
                        if (letra.equals("6")) {
                            robot.keyPress(54);
                            robot.keyRelease(54);
                        }
                        break;
                    case 55:
                        if (letra.equals("7")) {
                            robot.keyPress(55);
                            robot.keyRelease(55);
                        }
                        break;
                    case 56:
                        if (letra.equals("8")) {
                            robot.keyPress(56);
                            robot.keyRelease(56);
                        }
                        break;
                    case 57:
                        if (letra.equals("9")) {
                            robot.keyPress(57);
                            robot.keyRelease(57);
                        }
                        break;
                    case 64:
                        if (letra.equals("@")) {
                            robot.keyPress(18);

                            for (k = 3; k >= 0; --k) {
                                numpad_kc = 64 / (int) Math.pow(10.0D,
                                        (double) k) % 10 + 96;
                                robot.keyPress(numpad_kc);
                                robot.keyRelease(numpad_kc);
                            }

                            robot.keyRelease(18);
                        }
                        break;
                    case 65:
                        if (letra.equals("A")) {
                            robot.keyPress(65);
                        }
                        break;
                    case 66:
                        if (letra.equals("B")) {
                            robot.keyPress(66);
                        }
                        break;
                    case 67:
                        if (letra.equals("C")) {
                            robot.keyPress(67);
                        }
                        break;
                    case 68:
                        if (letra.equals("D")) {
                            robot.keyPress(68);
                        }
                        break;
                    case 69:
                        if (letra.equals("E")) {
                            robot.keyPress(69);
                        }
                        break;
                    case 70:
                        if (letra.equals("F")) {
                            robot.keyPress(70);
                        }
                        break;
                    case 71:
                        if (letra.equals("G")) {
                            robot.keyPress(71);
                        }
                        break;
                    case 72:
                        if (letra.equals("H")) {
                            robot.keyPress(72);
                        }
                        break;
                    case 73:
                        if (letra.equals("I")) {
                            robot.keyPress(73);
                        }
                        break;
                    case 74:
                        if (letra.equals("J")) {
                            robot.keyPress(74);
                        }
                        break;
                    case 75:
                        if (letra.equals("K")) {
                            robot.keyPress(75);
                        }
                        break;
                    case 76:
                        if (letra.equals("L")) {
                            robot.keyPress(76);
                        }
                        break;
                    case 77:
                        if (letra.equals("M")) {
                            robot.keyPress(77);
                        }
                        break;
                    case 78:
                        if (letra.equals("N")) {
                            robot.keyPress(78);
                        }
                        break;
                    case 79:
                        if (letra.equals("O")) {
                            robot.keyPress(79);
                        }
                        break;
                    case 80:
                        if (letra.equals("P")) {
                            robot.keyPress(80);
                        }
                        break;
                    case 81:
                        if (letra.equals("Q")) {
                            robot.keyPress(81);
                        }
                        break;
                    case 82:
                        if (letra.equals("R")) {
                            robot.keyPress(82);
                        }
                        break;
                    case 83:
                        if (letra.equals("S")) {
                            robot.keyPress(83);
                        }
                        break;
                    case 84:
                        if (letra.equals("T")) {
                            robot.keyPress(84);
                        }
                        break;
                    case 85:
                        if (letra.equals("U")) {
                            robot.keyPress(85);
                        }
                        break;
                    case 86:
                        if (letra.equals("V")) {
                            robot.keyPress(86);
                        }
                        break;
                    case 87:
                        if (letra.equals("W")) {
                            robot.keyPress(87);
                        }
                        break;
                    case 88:
                        if (letra.equals("X")) {
                            robot.keyPress(88);
                        }
                        break;
                    case 89:
                        if (letra.equals("Y")) {
                            robot.keyPress(89);
                        }
                        break;
                    case 90:
                        if (letra.equals("Z")) {
                            robot.keyPress(90);
                        }
                        break;
                    case 97:
                        if (letra.equals("a")) {
                            robot.keyPress(65);
                            robot.keyRelease(16);
                        }
                        break;
                    case 98:
                        if (letra.equals("b")) {
                            robot.keyPress(66);
                            robot.keyRelease(16);
                        }
                        break;
                    case 99:
                        if (letra.equals("c")) {
                            robot.keyPress(67);
                            robot.keyRelease(16);
                        }
                        break;
                    case 100:
                        if (letra.equals("d")) {
                            robot.keyPress(68);
                            robot.keyRelease(16);
                        }
                        break;
                    case 101:
                        if (letra.equals("e")) {
                            robot.keyPress(69);
                            robot.keyRelease(16);
                        }
                        break;
                    case 102:
                        if (letra.equals("f")) {
                            robot.keyPress(70);
                            robot.keyRelease(16);
                        }
                        break;
                    case 103:
                        if (letra.equals("g")) {
                            robot.keyPress(71);
                            robot.keyRelease(16);
                        }
                        break;
                    case 104:
                        if (letra.equals("h")) {
                            robot.keyPress(72);
                            robot.keyRelease(16);
                        }
                        break;
                    case 105:
                        if (letra.equals("i")) {
                            robot.keyPress(73);
                            robot.keyRelease(16);
                        }
                        break;
                    case 106:
                        if (letra.equals("j")) {
                            robot.keyPress(74);
                            robot.keyRelease(16);
                        }
                        break;
                    case 107:
                        if (letra.equals("k")) {
                            robot.keyPress(75);
                            robot.keyRelease(16);
                        }
                        break;
                    case 108:
                        if (letra.equals("l")) {
                            robot.keyPress(76);
                            robot.keyRelease(16);
                        }
                        break;
                    case 109:
                        if (letra.equals("m")) {
                            robot.keyPress(77);
                            robot.keyRelease(16);
                        }
                        break;
                    case 110:
                        if (letra.equals("n")) {
                            robot.keyPress(78);
                            robot.keyRelease(16);
                        }
                        break;
                    case 111:
                        if (letra.equals("o")) {
                            robot.keyPress(79);
                            robot.keyRelease(16);
                        }
                        break;
                    case 112:
                        if (letra.equals("p")) {
                            robot.keyPress(80);
                            robot.keyRelease(16);
                        }
                        break;
                    case 113:
                        if (letra.equals("q")) {
                            robot.keyPress(81);
                            robot.keyRelease(16);
                        }
                        break;
                    case 114:
                        if (letra.equals("r")) {
                            robot.keyPress(82);
                            robot.keyRelease(16);
                        }
                        break;
                    case 115:
                        if (letra.equals("s")) {
                            robot.keyPress(83);
                            robot.keyRelease(16);
                        }
                        break;
                    case 116:
                        if (letra.equals("t")) {
                            robot.keyPress(84);
                            robot.keyRelease(16);
                        }
                        break;
                    case 117:
                        if (letra.equals("u")) {
                            robot.keyPress(85);
                            robot.keyRelease(16);
                        }
                        break;
                    case 118:
                        if (letra.equals("v")) {
                            robot.keyPress(86);
                            robot.keyRelease(16);
                        }
                        break;
                    case 119:
                        if (letra.equals("w")) {
                            robot.keyPress(87);
                            robot.keyRelease(16);
                        }
                        break;
                    case 120:
                        if (letra.equals("x")) {
                            robot.keyPress(88);
                            robot.keyRelease(16);
                        }
                        break;
                    case 121:
                        if (letra.equals("y")) {
                            robot.keyPress(89);
                            robot.keyRelease(16);
                        }
                        break;
                    case 122:
                        if (letra.equals("z")) {
                            robot.keyPress(90);
                            robot.keyRelease(16);
                        }
                    case 42:
                        if (letra.equals("*")) {
                            robot.keyPress(18);

                            for (k = 3; k >= 0; --k) {
                                numpad_kc = 42 / (int) Math.pow(10.0D,
                                        (double) k) % 10 + 96;
                                robot.keyPress(numpad_kc);
                                robot.keyRelease(numpad_kc);
                            }

                            robot.keyRelease(18);
                        }
                        break;
                }
            }

            robot.keyRelease(16);
        } catch (AWTException var8) {
            var8.printStackTrace();
        }

    }
}