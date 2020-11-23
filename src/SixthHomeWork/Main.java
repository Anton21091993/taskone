package SixthHomeWork;

import FifthHomeWork.EasySearch;
import FifthHomeWork.ISearchEngine;

import java.io.*;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        int textPartsCount = 2;

        boolean useLambda = true;
        boolean firstLine = true;


        StringBuffer stringBuffer = new StringBuffer();


        char[] line;
        Console reader = null;
        while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


                System.out.println("Cлово \u001B[34m" + word
                        + "\u001B[0m встречается в тексте "
                        + WordCount.get(stringBuffer.toString(), textPartsCount,
                        word, engine, false, useLambda) + " раз(а) ("
                        + (System.currentTimeMillis() - startMillis) + " мс)");
            }


        }
    }
}
