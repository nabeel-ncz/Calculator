import java.awt.Color;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;




public class Calculator implements ActionListener {
	
	boolean isOperatorClicked=false;
	
	String OldValue;

	String newValue;

	float result;
	JFrame jf;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton zeroButton;
	JButton dotButton;
	JButton delButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton equalButton,addButton,subButton,divButton,mulButton,clearButton;
	char Operator;
	
	JLabel displayLabel;
	
	
	
	
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.getContentPane().setBackground(new Color(31, 95, 112));
		jf.setSize(560,640);
        jf.setLayout(null);
        jf.setLocation(100,100);
        
        displayLabel=new JLabel();
        displayLabel.setBounds(50,26,440,60);
        displayLabel.setBackground(Color.white);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.black);
        displayLabel.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
        
        jf.add(displayLabel);
        
        clearButton=new JButton("Clear");
        clearButton.setForeground(Color.white);
        clearButton.setBackground(new Color(193, 21, 16));
        clearButton.setBounds(55,120,140,50);
        clearButton.setFont(new Font("SansSerif",Font.PLAIN,14));
        clearButton.setFocusPainted(false);
        clearButton.addActionListener(this);
        jf.add(clearButton);
        
        equalButton=new JButton("=");
        equalButton.setForeground(Color.white);
        equalButton.setBackground(new Color(2, 165, 187));
        equalButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        equalButton.setFocusPainted(false);
        equalButton.setBounds(390,120,90,50);
        equalButton.addActionListener(this);
        jf.add(equalButton);
        
        
        sevenButton=new JButton("7");
        sevenButton.setForeground(Color.white);
        sevenButton.setBackground(Color.black);
        sevenButton.setBounds(55,210,80,60);
        sevenButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        sevenButton.setFocusPainted(false);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);
        
        eightButton=new JButton("8");
        eightButton.setForeground(Color.white);
        eightButton.setBackground(Color.black);
        eightButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        eightButton.setFocusPainted(false);
        eightButton.setBounds(160,210,80,60);
        eightButton.addActionListener(this);
        jf.add(eightButton);
        
        nineButton=new JButton("9");
        nineButton.setForeground(Color.white);
        nineButton.setBackground(Color.black);
        nineButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        nineButton.setFocusPainted(false);
        nineButton.setBounds(270,210,80,60);
        nineButton.addActionListener(this);
        jf.add(nineButton);
        
        fourButton=new JButton("4");
        fourButton.setForeground(Color.white);
        fourButton.setBackground(Color.black);
        fourButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        fourButton.setFocusPainted(false);
        fourButton.setBounds(55,310,80,60);
        fourButton.addActionListener(this);
        jf.add(fourButton);
        
        fiveButton=new JButton("5");
        fiveButton.setForeground(Color.white);
        fiveButton.setBackground(Color.black);
        fiveButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        fiveButton.setFocusPainted(false);
        fiveButton.setBounds(160,310,80,60);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);
        
        sixButton=new JButton("6");
        sixButton.setForeground(Color.white);
        sixButton.setBackground(Color.black);
        sixButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        sixButton.setFocusPainted(false);
        sixButton.setBounds(270,310,80,60);
        sixButton.addActionListener(this);
        jf.add(sixButton);
        
        oneButton=new JButton("1");
        oneButton.setForeground(Color.white);
        oneButton.setBackground(Color.black);
        oneButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        oneButton.setFocusPainted(false);
        oneButton.setBounds(55,410,80,60);
        oneButton.addActionListener(this);
        jf.add(oneButton);
        
        twoButton=new JButton("2");
        twoButton.setForeground(Color.white);
        twoButton.setBackground(Color.black);
        twoButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        twoButton.setFocusPainted(false);
        twoButton.setBounds(160,410,80,60);
        twoButton.addActionListener(this);
        jf.add(twoButton);
        
        threeButton=new JButton("3");
        threeButton.setForeground(Color.white);
        threeButton.setBackground(Color.black);
        threeButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        threeButton.setFocusPainted(false);
        threeButton.setBounds(270,410,80,60);
        threeButton.addActionListener(this);
        jf.add(threeButton);
        
        zeroButton=new JButton("0");
        zeroButton.setForeground(Color.white);
        zeroButton.setBackground(Color.black);
        zeroButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        zeroButton.setFocusPainted(false);
        zeroButton.setBounds(160,510,80,60);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);
        
        dotButton=new JButton(".");
        dotButton.setForeground(Color.white);
        dotButton.setBackground(Color.black);
        dotButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 24));
        dotButton.setFocusPainted(false);
        dotButton.setBounds(55,510,80,60);
        dotButton.addActionListener(this);
        jf.add(dotButton);
        
        delButton=new JButton("DEL");
        delButton.setForeground(Color.white);
        delButton.setBackground(Color.black);
        delButton.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
        delButton.setFocusPainted(false);
        delButton.setBounds(270,510,80,60);
        delButton.addActionListener(this);
        jf.add(delButton);
        
        
        
        mulButton=new JButton("x");
        mulButton.setForeground(Color.WHITE);
        mulButton.setBackground(new Color(0, 25, 39));
        mulButton.setBounds(390,210,90,60);
        mulButton.setFocusPainted(false);
        mulButton.setFont(new Font("Monospace", Font.BOLD, 24));
        mulButton.setHorizontalAlignment(SwingConstants.CENTER);
        mulButton.addActionListener(this);
        jf.add(mulButton);
        
        divButton=new JButton("/");
        divButton.setForeground(Color.WHITE);
        divButton.setBackground(new Color(0, 25, 39));
        divButton.setBounds(390,310,90,60);
        divButton.setFocusPainted(false);
        divButton.setFont(new Font("Monospace", Font.BOLD, 24));
        divButton.setHorizontalAlignment(SwingConstants.CENTER);
        divButton.addActionListener(this);
        jf.add(divButton);
        
        addButton=new JButton("+");
        addButton.setForeground(Color.WHITE);
        addButton.setBackground(new Color(0, 25, 39));
        addButton.setBounds(390,410,90,60);
        addButton.setFocusPainted(false);
        addButton.setFont(new Font("Monospace", Font.BOLD, 24));
        addButton.setHorizontalAlignment(SwingConstants.CENTER);
        addButton.addActionListener(this);
        jf.add(addButton);
        
        subButton=new JButton("-");
        subButton.setForeground(Color.WHITE);
        subButton.setBackground(new Color(0, 25, 39));
        subButton.setBounds(390,510,90,60);
        subButton.setFocusPainted(false);
        subButton.setFont(new Font("Monospace", Font.BOLD, 24));
        subButton.setHorizontalAlignment(SwingConstants.CENTER);
        subButton.addActionListener(this);
        jf.add(subButton);
        
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}
	
	
	public static void main(String[] args) {
		new Calculator();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
				
			}
			else{
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
			
		}else if(e.getSource()==eightButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}else if(e.getSource()==nineButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
			
		}else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
			
		}else if(e.getSource()==fiveButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}else if(e.getSource()==sixButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else if(e.getSource()==oneButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource()==threeButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
			
		}else if(e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
			
		}else if(e.getSource()==equalButton) {
			
			newValue=displayLabel.getText();
			
			float newValueF=Float.parseFloat(newValue);
			float OldValueF=Float.parseFloat(OldValue);
			
			switch (Operator) {
			case '+' :
				result=OldValueF+newValueF;
				break;
			case '-':
				result=OldValueF-newValueF;
				break;
			case '*':
				result=OldValueF*newValueF;
				break;
			case '/':
				result=OldValueF/newValueF;
				break;
			
			default:
				
			}
			
			displayLabel.setText(result+"");
			OldValueF=result;
			
			
			
		}else if(e.getSource()==addButton) {
			Operator = '+';
			isOperatorClicked=true;
			OldValue=displayLabel.getText();
			
		}else if(e.getSource()==subButton) {
			Operator = '-';
			isOperatorClicked=true;
			OldValue=displayLabel.getText();
			
			
			
		}else if(e.getSource()==mulButton) {
			Operator = '*';
			isOperatorClicked=true;
			OldValue=displayLabel.getText();
			
		}else if(e.getSource()==divButton) {
			Operator = '/';
			isOperatorClicked=true;
			OldValue=displayLabel.getText();
			
			
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}else if(e.getSource()==delButton) {
			displayLabel.setText (displayLabel.getText ().substring (0, displayLabel.getText ().length () - 1));
		}
	
        }
		
}
           //===========================END===========================//