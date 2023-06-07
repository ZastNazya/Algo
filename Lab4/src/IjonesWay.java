import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IjonesWay {
        private int w;
        private int h;
        
        private  char[][] corridor = new char[h][w];

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public char[][] getCorridor() {
        return corridor;
    }

    public void ijonesWay () {
            try {
                File file = new File("/Users/nazar/Desktop/Algo/Lab4/ijones.in");
                Scanner input = new Scanner(file);
                this.w = input.nextInt();
                this.h = input.nextInt();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }

            char[][] corridor = new char[h][w];

            try{
                File file = new File("/Users/nazar/Desktop/Algo/Lab4/ijones.in");
                FileReader fr = new FileReader(file);
                char[] chars = new char[(int) file.length()];
                fr.read(chars);
                int k = 0;
                for (; k < chars.length; k++) {
                    if ('\n' == chars[k]){
                        k=k+1;
                        break;
                    }
                }
                for (int i=0; i < h; i++) {
                    for (int j=0; j < w; j++) {
                        while (k < chars.length) {
                            if ('\n' != chars[k]) {
                                corridor[i][j] = chars[k];
                                break;
                            }
                            else {
                                k++;
                                corridor[i][j] = chars[k];
                                break;
                            }
                        }
                        k++;
                    }
                }
                this.corridor=corridor;
            }

            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

