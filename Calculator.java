import java.util.List;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Calculator
{
    private JFrame f;
    private JPanel p;
    private JTextField tF;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton bAdd, bSubtract, bMultiply, bDivide, bEqual, bAC;
    private double n1;
    private double n2;
    private double ans;
    private String fAns;
    private boolean newCalc;
    private String arithExpression ;
    /**
     * Constructor for objects of class Calc
     */
    public Calculator()
    {
        // initialise instance variables
        arithExpression = "";
        makeFrame();
        f.pack();
        newCalc = true;
    }
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            calc.makeFrame();
        }
    
    public void makeFrame(){
        //initialising frame
        f = new JFrame("Calculator");
        f.setSize(350,500);

        //initialise p
        p = new JPanel(new GridLayout(4,4));

        //initialise txtField
        tF = new JTextField();
        tF.setFont(new Font("Arial", Font.BOLD, 20));
        tF.setEditable(false);

        //initialising buttons to add to panel
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bAdd = new JButton("+");
        bSubtract =new JButton("-");
        bMultiply = new JButton("x");
        bDivide = new JButton("÷");
        bEqual = new JButton("=");
        bAC = new JButton("AC");

        //adding buttons to panel
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bDivide);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bMultiply);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bSubtract);
        p.add(bAC);
        p.add(b0);
        p.add(bEqual);
        p.add(bAdd);

        //Function for number buttons using lambda expressions
        b0.addActionListener(e ->{
                    if(tF.getText().equals("x") || tF.getText().equals("+") || tF.getText().equals("÷") || tF.getText().equals("-") || !newCalc){
                        tF.setText("");
                    }
                    tF.setText(tF.getText() + "0");
                    arithExpression = arithExpression.concat("0");
            });
        b1.addActionListener(e ->{
                    if(tF.getText().equals("x") || tF.getText().equals("+") || tF.getText().equals("÷") || tF.getText().equals("-") || !newCalc ){
                        tF.setText("");
                    }
                    tF.setText(tF.getText() + "1");
                    arithExpression = arithExpression.concat("1");
            });
        b2.addActionListener(e -> {
                    if(tF.getText().equals("x") || tF.getText().equals("+") || tF.getText().equals("÷") || tF.getText().equals("-") || !newCalc ){
                        tF.setText("");
                    }
                    tF.setText(tF.getText() + "2");
                    arithExpression = arithExpression.concat("2");
            });
        b3.addActionListener(e ->{      
                    if(tF.getText().equals("x") || tF.getText().equals("+") || tF.getText().equals("÷") || tF.getText().equals("-") || !newCalc ){
                        tF.setText("");
                    }
                    tF.setText(tF.getText() + "3");
                    arithExpression = arithExpression.concat("3");
            });
        b4.addActionListener(e -> {
                    if(tF.getText().equals("x") || tF.getText().equals("+") || tF.getText().equals("÷") || tF.getText().equals("-") || !newCalc ){
                        tF.setText("");
                    }
                    tF.setText(tF.getText() + "4");
                    arithExpression = arithExpression.concat("4");
            });
        b5.addActionListener(e -> {
                    if(tF.getText().equals("x") || tF.getText().equals("+") || tF.getText().equals("÷") || tF.getText().equals("-") || !newCalc ){
                        tF.setText("");
                    }
                    tF.setText(tF.getText() + "5");
                    arithExpression = arithExpression.concat("5");
            });
        b6.addActionListener(e -> {
                    if(tF.getText().equals("x") || tF.getText().equals("+") || tF.getText().equals("÷") || tF.getText().equals("-") || !newCalc){
                        tF.setText("");
                    }
                    tF.setText(tF.getText() + "6");
                    arithExpression = arithExpression.concat("6");
            });
        b7.addActionListener(e ->{
                    if(tF.getText().equals("x") || tF.getText().equals("+") || tF.getText().equals("÷") || tF.getText().equals("-") || !newCalc ){
                        tF.setText("");
                    }
                    tF.setText(tF.getText() + "7");
                    arithExpression = arithExpression.concat("7");
            });
        b8.addActionListener(e ->{
                    if(tF.getText().equals("x") || tF.getText().equals("+") || tF.getText().equals("÷") || tF.getText().equals("-") || !newCalc ){
                        tF.setText("");
                    }
                    tF.setText(tF.getText() + "8");
                    arithExpression = arithExpression.concat("8");
            });
        b9.addActionListener(e -> {
                    if(tF.getText().equals("x") || tF.getText().equals("+") || tF.getText().equals("÷") || tF.getText().equals("-") || !newCalc ){
                        tF.setText("");
                    }
                    tF.setText(tF.getText() + "9");
                    arithExpression = arithExpression.concat("9");
                    newCalc=true;
            });
            
        //operator functions using lambda experissions
        bAdd.addActionListener(e -> {
                    tF.setText("+");
                    arithExpression = arithExpression.concat("+");
            });
        bSubtract.addActionListener(e -> {
                    tF.setText("-");
                    arithExpression = arithExpression.concat("-");
            });
        bMultiply.addActionListener(e -> {
                    tF.setText("x");
                    arithExpression = arithExpression.concat("*");
            });
        bDivide.addActionListener(e -> {
                    tF.setText("÷");
                    arithExpression = arithExpression.concat("/");
            });        
        bAC.addActionListener(e -> {
                    arithExpression = "";
                    ans = 0;
                    fAns="";
                    n1=0;
                    n2=0;
                    tF.setText("");
                    newCalc=true;
            });
        bEqual.addActionListener(e -> {
                    tF.setText(performCalculation());
                    arithExpression="";
                    newCalc=false;
            });

    
        //initiliase on creation
        Container cP = f.getContentPane();
        cP.add(tF, BorderLayout.NORTH);
        cP.add(p, BorderLayout.CENTER);
        f.setVisible(true);
    }
    
    //function to perform calculation
    private String performCalculation() {
            //splits our arithmetic expression string into
            String[] splitExpressions = arithExpression.split("(?<=[-+*/()])|(?=[-+*/()])|\\s+");
            List<String> ar = new ArrayList<>(Arrays.asList(splitExpressions));
            if(ar.isEmpty()){
                //if no numbers are in the expression return 0
                fAns = "0";
                return fAns;
            }
            // checks for negative ints if not removes "-" operator
            if (ar.get(0).equals("-") && (!ar.get(1).equals("+") || !ar.get(1).equals("/") || !ar.get(1).equals("*") || !ar.get(1).equals("-"))){
                String negNumb= ar.get(0)+ar.get(1);
                ar.remove(0);
                ar.set(0, negNumb);
            }
                        for (int i = 0; i < ar.size() - 2; i++) {
                String cur = ar.get(i);
                String cur2 = ar.get(i + 1);
                String cur3 = ar.get(i+ 2);
                
                if (cur.equals("+") || cur.equals("/") || cur.equals("*") || cur.equals("-")) {
                    if(cur2.equals("-")){
                        if((!cur3.equals("+") && !cur3.equals("/") && !cur3.equals("*") && !cur3.equals("-"))){
                            String negNumb2= ar.get(i+1)+ar.get(i+2);
                            ar.remove(i+1);
                            ar.set(i+1, negNumb2);
                        }
                    } 
                }
            }       
            //removes if more than 1 operator is contantenated onea fter another
                // for highest index          
            while (ar.size() > 0 && (ar.get(ar.size()-1).equals("+") || ar.get(ar.size()-1).equals("/") || ar.get(ar.size()-1).equals("*") || ar.get(ar.size()-1).equals("-"))) {
                ar.remove(ar.size()-1);    
            }        
                //for lowest index   
            while(ar.get(0).equals("+") || ar.get(0).equals("/") || ar.get(0).equals("*")){
                ar.remove(ar.get(0));
                }
                //for all other indexes
             for(int i=0; i<ar.size()-1; i++){
                String cur = ar.get(i);
                String cur2 = ar.get(i+1);
                
                if(cur.equals("+") || cur.equals("/") || cur.equals("*") || cur.equals("-")){
                    if(cur2.equals("+") || cur2.equals("/") || cur2.equals("*") || cur2.equals("-")){
                        ar.remove(i);
                        i--;
                    }
                }
            }
            //if calculation continues from equal
            if(newCalc){
                if(!("+".equals(ar.get(0)) || "/".equals(ar.get(0)) || "*".equals(ar.get(0)) || "-".equals(ar.get(0)))){
                    fAns = ar.get(0);
                }
            }
            //main calulation
            for(int i=0; i<ar.size(); i++){
                String cur = ar.get(i);
                if(cur.equals("/")){
                    n2 = Double.parseDouble(ar.get(i+1));
                    n1 = Double.parseDouble(ar.get(i-1));
                    ans = n1 / n2;
                    ar.remove(i-1);
                    ar.remove(i-1);
                    ar.set(i-1, Double.toString(ans));
                    i -= 1;
                }
            }
            for(int i=0; i<ar.size(); i++){
                String cur = ar.get(i);
                if(cur.equals("*")){
                    n2 = Double.parseDouble(ar.get(i+1));
                    n1 = Double.parseDouble(ar.get(i-1));
                    ans = n1 * n2;
                    ar.remove(i-1);
                    ar.remove(i-1);
                    ar.set(i-1, Double.toString(ans));
                    i -= 1;
                }
            }
            for(int i=0; i<ar.size(); i++){
                String cur = ar.get(i);
                if(cur.equals("+")){
                    n2 = Double.parseDouble(ar.get(i+1));
                    n1 = Double.parseDouble(ar.get(i-1));
                    ans = n1 + n2;
                    ar.remove(i-1);
                    ar.remove(i-1);
                    ar.set(i-1, Double.toString(ans));
                    i -= 1;
                }
            }
            for(int i=0; i<ar.size(); i++){
                String cur = ar.get(i);
                if(cur.equals("-")){
                    n2 = Double.parseDouble(ar.get(i+1));
                    n1 = Double.parseDouble(ar.get(i-1));
                    ans = n1 - n2;
                    ar.remove(i-1);
                    ar.remove(i-1);
                    ar.set(i-1, Double.toString(ans));
                    i -= 1;
                }
            }
            return fAns =ar.get(0);
        }
    }

       
