import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener {
	

	

	JFrame jf;
	JLabel displayLabel;
	JLabel seconddisplay;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton multiplicButton;
	JButton minusButton;
	JButton plusButton,clearButton;
	String oldValue="0";
	String scndValue;
	int flag=0;
	float result=0,fiValue=0,scdValue=0;
	boolean isOperatorClicked=true;
	boolean dotFlag=false;
	
	Calculator(){
	

	jf=new JFrame("Calculator");
	jf.setLayout(null);
	jf.setSize(600,600);
	
	jf.setLocation(500,150);
	
	displayLabel=new JLabel("0");
	displayLabel.setBounds(30, 30, 540, 80);
	displayLabel.setBackground(Color.WHITE);
	displayLabel.setOpaque(true);
	displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	displayLabel.setForeground(Color.black);
	displayLabel.setFont(new Font("ariel",Font.BOLD,40));
	
	jf.add(displayLabel);
	
	seconddisplay=new JLabel("/");
	seconddisplay.setBounds(30, 10, 530, 20);
	seconddisplay.setHorizontalAlignment(SwingConstants.RIGHT);
	jf.add(seconddisplay);
	
	
	Font bigFont=new Font("Ariel",Font.PLAIN, 35);
	
	sevenButton=new JButton("7");
	sevenButton.setBounds(30, 130, 80, 80);
	sevenButton.addActionListener(this);
	sevenButton.setFont(bigFont);
	jf.add(sevenButton);	
	
	eightButton=new JButton("8");
	eightButton.setBounds(130, 130, 80, 80);
	eightButton.addActionListener(this);
	eightButton.setFont(bigFont);
	jf.add(eightButton);
	
	 nineButton=new JButton("9");
	nineButton.setBounds(230, 130, 80, 80);
	nineButton.addActionListener(this);
	nineButton.setFont(bigFont);
	jf.add(nineButton);
	
    fourButton=new JButton("4");
	fourButton.setBounds(30,230,80,80);
	fourButton.addActionListener(this);
	fourButton.setFont(bigFont);
	jf.add(fourButton);
	
	fiveButton=new JButton("5");
	fiveButton.setBounds(130, 230, 80, 80);
	fiveButton.addActionListener(this);
	fiveButton.setFont(bigFont);
	jf.add(fiveButton);
	
	sixButton=new JButton("6");
	sixButton.setBounds(230, 230, 80, 80);
	sixButton.addActionListener(this);
	sixButton.setFont(bigFont);
	jf.add(sixButton);
	
	oneButton=new JButton("1");
	oneButton.setBounds(30, 330, 80, 80);
	oneButton.addActionListener(this);
	oneButton.setFont(bigFont);
	jf.add(oneButton);
	
	twoButton=new JButton("2");
	twoButton.setBounds(130, 330, 80, 80);
	twoButton.addActionListener(this);
	twoButton.setFont(bigFont);
	jf.add(twoButton);
	
	threeButton=new JButton("3");
	threeButton.setBounds(230, 330, 80, 80);
	threeButton.addActionListener(this);
	threeButton.setFont(bigFont);
	jf.add(threeButton);
	
	dotButton=new JButton(".");
	dotButton.setBounds(30, 430, 80, 80);
	dotButton.addActionListener(this);
    dotButton.setFont(bigFont);
	jf.add(dotButton);
	
	zeroButton=new JButton("0");
	zeroButton.setBounds(130, 430, 80, 80);
	zeroButton.addActionListener(this);
	zeroButton.setFont(bigFont);
	jf.add(zeroButton);
	
	equalButton=new JButton("=");
	equalButton.setBounds(230, 430, 80, 80);
	equalButton.setBackground(Color.lightGray);
	equalButton.addActionListener(this);
	equalButton.setFont(bigFont);
	
	jf.add(equalButton);
	
	divButton=new JButton("÷");
	divButton.setBounds(330, 130, 80, 80);
	divButton.addActionListener(this);
	divButton.setFont(bigFont);
	jf.add(divButton);
	
	multiplicButton=new JButton("x");
	multiplicButton.setBounds(330, 230, 80, 80);
	multiplicButton.addActionListener(this);
	multiplicButton.setFont(bigFont);
	jf.add(multiplicButton);
	
	minusButton=new JButton("-");
	minusButton.setBounds(330, 330, 80, 80);
	minusButton.addActionListener(this);
	minusButton.setFont(bigFont);
	jf.add(minusButton);
	
	plusButton=new JButton("+");
	plusButton.setBounds(330, 430, 80, 80);
	plusButton.addActionListener(this);
	plusButton.setFont(bigFont);

	jf.add(plusButton);
	
	clearButton=new JButton("CE");
	clearButton.setBounds(430, 410, 80, 100);
    clearButton.setFont(new Font ("Ariel",Font.BOLD,30));
    clearButton.addActionListener(this);
	jf.add(clearButton);
	
	
	
	
	
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
		
		else {
	displayLabel.setText(displayLabel.getText()+"7");}
	}
	else if(e.getSource()==eightButton) {
		if(isOperatorClicked) {
			displayLabel.setText("8");
			isOperatorClicked=false;
			
		}
		else {
	displayLabel.setText(displayLabel.getText()+"8");}
		}
	else if(e.getSource()==nineButton) {
		if(isOperatorClicked) {
			displayLabel.setText("9");
			isOperatorClicked=false;
		}
		else {
	displayLabel.setText(displayLabel.getText()+"9");}
			}
	else if(e.getSource()==fourButton) {
		if(isOperatorClicked) {
			displayLabel.setText("4");
			isOperatorClicked=false;
		}
		else {
	displayLabel.setText(displayLabel.getText()+"4");}
		}
	else if(e.getSource()==fiveButton) {
		if(isOperatorClicked) {
			displayLabel.setText("5");
			isOperatorClicked=false;
		}
		else {
	displayLabel.setText(displayLabel.getText()+"5");}
		}
	else if(e.getSource()==sixButton) {
		if(isOperatorClicked) {
			displayLabel.setText("6");
			isOperatorClicked=false;
		}
		else {
	displayLabel.setText(displayLabel.getText()+"6");}
		}
	else if(e.getSource()==oneButton) {
		if(isOperatorClicked) {
			displayLabel.setText("1");
			isOperatorClicked=false;
		}
		else {
	displayLabel.setText(displayLabel.getText()+"1");}
		}
	else if(e.getSource()==twoButton) {
		if(isOperatorClicked) {
			displayLabel.setText("2");
			isOperatorClicked=false;
		}
		else {
	displayLabel.setText(displayLabel.getText()+"2");}
		}
	else if(e.getSource()==threeButton) {
		if(isOperatorClicked) {
			displayLabel.setText("3");
			isOperatorClicked=false;
		}
		else {
	displayLabel.setText(displayLabel.getText()+"3");}
		}
	else if(e.getSource()==dotButton) {
		if(isOperatorClicked) {
			displayLabel.setText("0.");
			isOperatorClicked=false;
			dotFlag=true;}
		
		else {
			if(!dotFlag)
			displayLabel.setText(displayLabel.getText()+".");
			dotFlag=true;
			}
	}
		else if(e.getSource()==zeroButton) {
			if(isOperatorClicked|displayLabel.getText()=="0") {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}
			else {
		displayLabel.setText(displayLabel.getText()+"0");}
			}
		else if(e.getSource()==divButton) {
			if(oldValue!="0"&&!isOperatorClicked)
			{ scndValue=displayLabel.getText();
				fncResult();
			}

			isOperatorClicked=true;
			dotFlag=false;
			oldValue=displayLabel.getText();
			flag=4; 
			}
		else if(e.getSource()==multiplicButton) {
			if(oldValue!="0"&&!isOperatorClicked)
			{ scndValue=displayLabel.getText();
				fncResult();
			}

			isOperatorClicked=true;
			dotFlag=false;
			oldValue=displayLabel.getText();
			flag=3;
			}
		else if(e.getSource()==minusButton) {
			if(oldValue!="0"&&!isOperatorClicked)
			{ scndValue=displayLabel.getText();
				fncResult();
			}

			isOperatorClicked=true;
			dotFlag=false;
			oldValue=displayLabel.getText();
			flag=2;
				 }
		else if(e.getSource()==plusButton) {
			if(oldValue!="0"&&!isOperatorClicked)
			{ scndValue=displayLabel.getText();
				fncResult();
			}
			isOperatorClicked=true;
			dotFlag=false;
			oldValue=displayLabel.getText();
			seconddisplay.setText(displayLabel.getText()+"+");
			flag=1;
			
					 }
		else if(e.getSource()==equalButton) {
			seconddisplay.setText(seconddisplay.getText()+displayLabel.getText()+"=");
			fncResult();
			
		}
			
			
			
	
		else if(e.getSource()==clearButton) {
			displayLabel.setText("0");
			seconddisplay.setText("");
			result=0;
			fiValue=0;
			scdValue=0;
			oldValue="0";
			isOperatorClicked=true;
			dotFlag=false;
			flag=0;
		
			
			
		}
			
		
	
		
	
		
	
	
	// TODO Auto-generated method stub
	
}

public void fncResult() {
	scndValue=displayLabel.getText();
	switch(flag) {
	case 1: {
	 fiValue=Float.parseFloat(oldValue);
	 scdValue=Float.parseFloat(scndValue);
	result=fiValue+scdValue;
	displayLabel.setText(result+"");
	break;}
	case 2 : {
			 fiValue=Float.parseFloat(oldValue);
			 scdValue=Float.parseFloat(scndValue);
			result=fiValue-scdValue;
			displayLabel.setText(result+"");
			break;}
	case 3 : {
		 fiValue=Float.parseFloat(oldValue);
		scdValue=Float.parseFloat(scndValue);
		result=fiValue*scdValue;
		displayLabel.setText(result+"");
		break;}
	case 4: {
		 fiValue=Float.parseFloat(oldValue);
		 scdValue=Float.parseFloat(scndValue);
		 if(fiValue==0&&scdValue==0) {
			 displayLabel.setText("Result is undefined");
			 flag=0;
		 }
		 else {
		result=fiValue/scdValue;
		displayLabel.setText(result+"");}
		break;
		}
         
	}
	
	
		

	
	
}
public static String fmt(double d)
{
    if(d == (long) d)
        return String.format("%d",(long)d);
    else
        return String.format("%s",d);
}


}


