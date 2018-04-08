import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.awt.event.KeyEvent.*;

public class OsBuddyChecker {


    public static void main(String[] args) throws Exception {
        type();
    }


    public static void type() throws AWTException, IOException, InterruptedException {
        Robot robot = new Robot();

        FileReader file = new FileReader("C:\\Users\\Swagmaster\\IdeaProjects\\OsbuddyChecker\\src\\acco.txt");
        BufferedReader reader = new BufferedReader(file);
        String text = "";
        String line = reader.readLine();


        while ((text = reader.readLine()) != null) {
            Thread.sleep(20000);
            robot.mouseMove(937, 538);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            String[] splitted = text.split(":");
            for (int i = 3; i <= 3; i++){
                Thread.sleep(3000);
                robot.mouseMove(947, 555);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(3000);
                robot.mouseMove(1032, 603);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(3000);
                robot.mouseMove(1025, 571);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }
            for (String part : splitted) {
                System.out.println(part);
                part = part + ":";
                //int length = characters.length();
                for (int i = 0; i < part.length(); i++) {
                    char character = part.charAt(i);
                    GetCharacter(character);
                }

                    //loginhandler handler = new loginhandler();
                    //if (character == 11){
                    //   System.out.println("gaylord");
                    // }
                    // else
                    // {
                    //     Thread.sleep(3000);
                       /* robot.mouseMove(947, 555);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        Thread.sleep(3000);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.mouseMove(1046, 553);
                        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                        robot.keyPress(VK_BACK_SLASH);
                    }*/
                    //robot.keyPress(KeyEvent.VK_SHIFT);
                    //robot.keyPress(character);
                    //char character = characters.charAt(i);
                    //robot.keyPress(character);
                }
            }
        }

    /*private void getKeyCode(KeyEvent e) throws InterruptedException, AWTException {
        if (e.getKeyCode()==KeyEvent.VK_ENTER){
            Robot robot = new Robot();

            Thread.sleep(3000);
            robot.mouseMove(947, 555);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(3000);
            robot.mouseMove(1032, 603);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(3000);
            robot.mouseMove(1025, 571);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }
    }*/

    public static void GetCharacter(char character) throws AWTException, InterruptedException {
                        Robot bot = new Robot();
                        Thread.sleep(100);
                        switch (character) {
                            case 'a':
                                bot.keyPress(VK_A);
                                break;
                            case 'b':
                                bot.keyPress(VK_B);
                                break;
                            case 'c':
                                bot.keyPress(VK_C);
                                break;
                            case 'd':
                                bot.keyPress(VK_D);
                                break;
                            case 'e':
                                bot.keyPress(VK_E);
                                break;
                            case 'f':
                                bot.keyPress(VK_F);
                                break;
                            case 'g':
                                bot.keyPress(VK_G);
                                break;
                            case 'h':
                                bot.keyPress(VK_H);
                                break;
                            case 'i':
                                bot.keyPress(VK_I);
                                break;
                            case 'j':
                                bot.keyPress(VK_J);
                                break;
                            case 'k':
                                bot.keyPress(VK_K);
                                bot.keyRelease(VK_K);
                                break;
                            case 'l':
                                bot.keyPress(VK_L);
                                break;
                            case 'm':
                                bot.keyPress(VK_M);
                                break;
                            case 'n':
                                bot.keyPress(VK_N);
                                break;
                            case 'o':
                                bot.keyPress(VK_O);
                                break;
                            case 'p':
                                bot.keyPress(VK_P);
                                break;
                            case 'q':
                                bot.keyPress(VK_Q);
                                break;
                            case 'r':
                                bot.keyPress(VK_R);
                                break;
                            case 's':
                                bot.keyPress(VK_S);
                                break;
                            case 't':
                                bot.keyPress(VK_T);
                                break;
                            case 'u':
                                bot.keyPress(VK_U);
                                break;
                            case 'v':
                                bot.keyPress(VK_V);
                                break;
                            case 'w':
                                bot.keyPress(VK_W);
                                break;
                            case 'x':
                                bot.keyPress(VK_X);
                                break;
                            case 'y':
                                bot.keyPress(VK_Y);
                                break;
                            case 'z':
                                bot.keyPress(VK_Z);
                                break;
                            case 'A':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_A);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'B':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_B);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'C':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_C);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'D':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_D);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'E':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_E);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'F':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_F);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'G':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_G);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'H':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_H);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'I':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_I);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'J':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_J);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'K':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_K);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'L':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_L);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'M':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_M);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'N':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_N);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'O':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_O);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'P':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_P);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'Q':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_Q);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'R':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_R);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'S':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_S);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'T':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_T);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'U':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_U);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'V':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_V);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'W':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_W);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'X':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_X);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'Y':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_Y);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case 'Z':
                                bot.keyPress(VK_SHIFT);
                                bot.keyPress(VK_Z);
                                bot.keyRelease(VK_SHIFT);
                                break;
                            case '`':
                                bot.keyPress(VK_BACK_QUOTE);
                                break;
                            case '0':
                                bot.keyPress(VK_0);
                                break;
                            case '1':
                                bot.keyPress(VK_1);

                                break;
                            case '2':
                                bot.keyPress(VK_2);

                                break;
                            case '3':
                                bot.keyPress(VK_3);

                                break;
                            case '4':
                                bot.keyPress(VK_4);
                                break;
                            case '5':
                                bot.keyPress(VK_5);
                                break;
                            case '6':
                                bot.keyPress(VK_6);
                                break;
                            case '7':
                                bot.keyPress(VK_7);
                                break;
                            case '8':
                                bot.keyPress(VK_8);
                                break;
                            case '9':
                                bot.keyPress(VK_9);
                                break;
                            case '-':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD4);
                                bot.keyPress(VK_NUMPAD5);
                                bot.keyRelease(VK_ALT);
                                break;
                            case '=':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD6);
                                bot.keyPress(VK_NUMPAD1);
                                bot.keyRelease(VK_ALT);
                                break;
                            case '~':
                                bot.keyPress(VK_CAPS_LOCK);
                                bot.keyPress(VK_BACK_QUOTE);
                                break;
                            case '!':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD3);
                                bot.keyPress(VK_NUMPAD3);
                                bot.keyRelease(VK_ALT);
                                break;
                            case '@':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD6);
                                bot.keyPress(VK_NUMPAD4);
                                bot.keyRelease(VK_ALT);
                                break;
                            case '#':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD3);
                                bot.keyPress(VK_NUMPAD5);
                                bot.keyRelease(VK_ALT);
                                break;
                            case '$':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD3);
                                bot.keyPress(VK_NUMPAD6);
                                bot.keyRelease(VK_ALT);
                                break;
                            case '%':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD3);
                                bot.keyPress(VK_NUMPAD7);
                                bot.keyRelease(VK_ALT);
                                break;
                            case '^':
                                bot.keyPress(VK_CIRCUMFLEX);
                                break;
                            case '&':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD3);
                                bot.keyPress(VK_NUMPAD8);
                                bot.keyRelease(VK_ALT);
                                break;
                            case '*':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD4);
                                bot.keyPress(VK_NUMPAD2);
                                bot.keyRelease(VK_ALT);
                                break;
                            case '(':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD4);
                                bot.keyPress(VK_NUMPAD0);
                                bot.keyRelease(VK_ALT);
                                break;
                            case ')':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD4);
                                bot.keyPress(VK_NUMPAD1);
                                bot.keyRelease(VK_ALT);
                                break;
                            case '_':
                                bot.keyPress(VK_ALT);
                                bot.keyPress(VK_NUMPAD9);
                                bot.keyPress(VK_NUMPAD5);
                                bot.keyRelease(VK_ALT);
                                break;
                            case '+':
                                bot.keyPress(VK_PLUS);
                                break;
                            case '\t':
                                bot.keyPress(VK_TAB);
                                break;
                            case '\n':
                                bot.keyPress(VK_ENTER);
                                break;
                            case '[':
                                bot.keyPress(VK_OPEN_BRACKET);
                                break;
                            case ']':
                                bot.keyPress(VK_CLOSE_BRACKET);
                                break;
                            case '\\':
                                bot.keyPress(VK_BACK_SLASH);
                                break;
                            case '{':
                                bot.keyPress(VK_CAPS_LOCK);
                                bot.keyPress(VK_OPEN_BRACKET);
                                break;
                            case '}':
                                bot.keyPress(VK_CAPS_LOCK);
                                bot.keyPress(VK_CLOSE_BRACKET);
                                break;
                            case '|':
                                bot.keyPress(VK_CAPS_LOCK);
                                bot.keyPress(VK_BACK_SLASH);
                                break;
                            case ';':
                                bot.keyPress(VK_SEMICOLON);
                                break;
                            case ':':
                                bot.keyPress(VK_ENTER);
                                break;
                            case '\'':
                                bot.keyPress(VK_QUOTE);
                                break;
                            case '"':
                                bot.keyPress(VK_QUOTEDBL);
                                break;
                            case ',':
                                bot.keyPress(VK_COMMA);
                                break;
                            case '<':
                                bot.keyPress(VK_CAPS_LOCK);
                                bot.keyPress(VK_COMMA);
                                break;
                            case '.':
                                bot.keyPress(VK_PERIOD);
                                break;
                            case '>':
                                bot.keyPress(VK_CAPS_LOCK);
                                bot.keyPress(VK_PERIOD);
                                break;
                            case '/':
                                bot.keyPress(VK_SLASH);
                                break;
                            case '?':
                                bot.keyPress(VK_CAPS_LOCK);
                                bot.keyPress(VK_SLASH);
                                break;
                            case ' ':
                                bot.keyPress(VK_SPACE);
                                break;
                            default:
                                throw new IllegalArgumentException("Cannot type character " + character);
                        }
                    }
                }

