package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kuku {
    /* �\��������̌� */
    public static final int MAX_QUESTION = 10;
   public static void main (String[] args){
       int goodAnswers = 0;  /* �����̌� */
        System.out.println("���ꂩ����̖���" + MAX_QUESTION + "��o���܂�");
        /* �ȉ��A�����J��Ԃ��\�����A���[�U����̉𓚂𔻒f���� */
        for(int i = 0; i < MAX_QUESTION; i++){
            boolean ok = showQuestion(i + 1);
            if (ok) {
                goodAnswers++;
            }
        }
        double rate = goodAnswers * 100.0 / MAX_QUESTION;
        System.out.println("");
        System.out.println("����" + MAX_QUESTION + "�₠��܂����B");
        System.out.println("������������ꂽ�̂�" + goodAnswers + "��ŁA");
        System.out.println("�Ԉ���Ă��܂����̂�" + (MAX_QUESTION - goodAnswers) + "    ��ł��B");
        System.out.println("��������" + rate + "%�ł��B");
        System.out.println("");
        System.out.println("����ꂳ�܁B");                                            
    }
    /*showQuestion �͋��̖���1��o���A������҂B*/
    public static boolean showQuestion (int questno) {
        int x = (int) (Math.random() * 9) + 1;
        int y = (int) (Math.random() * 9) + 1;
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        try{
            System.out.println("[��" + questno + "��]   " + x + " X " + y + " = ?");
            String line = reader.readLine();
            int result = Integer.parseInt(line);
            if(x * y == result) {
                System.out.println("�͂��A�������ł�");
                return true;
            } else {
                System.out.println("�c�O�A�܂������ł��B");
                return false;
            }
        } catch (IOException e) {
            System.out.println(e);                                                    
        } catch (NumberFormatException e) {
            System.out.println("���͂�����������܂���B");
        }
        return false;
    }
}
