import java.awt.*;
Import java.awt.event.*;
Import javax.swing.*;

public class Operator extends JFrame implements ActionListener
	{
Label l,l3;	
JLabel l2,l1;
Font f;
Button b1,b2,b3,b4,b5,b8,b9,b10;
Container c1;
        
Operator()
	{
        c1=getContentPane();
       c1.setLayout(new FlowLayout());
		
        setBackground(Color.LIGHT_GRAY);

       f=new Font("Arial",Font.BOLD,20);

        setFont(f);
        
		ImageIcon i=new ImageIcon("criminal1.jpg");

       

	   l=new Label("         Welcome  Chandu!!!!!!!!        ");
	   l2=new JLabel("     Hi,                 ",i,JLabel.LEADING);

	   l3=new Label("           This is Operator                                                       ",Label.CENTER);
      
       
      
       b3=new Button("   Identifying of Images                   ");

       b4=new Button("   Images from Data Base      ");
      
       //b5=new Button("   Images from Eyewitnesses   ");
       
       b8=new Button("   Drawing of Images          ");
       
	  // b9=new Button("   Matching of Images          ");
       
	 //b10=new Button("   Data to Administrator       ");
       

	   addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent  e)
			{
				System.exit(0);
			}
		});


       l.setForeground(new Color(100,100,100));
       l.setFont(new Font("Arial",Font.BOLD,30)); 
       l2.setForeground(new Color(100,100,100));
       l2.setFont(new Font("Arial",Font.BOLD,20)); 
       l3.setForeground(new Color(0,64,64));
       l3.setFont(new Font("Arial",Font.BOLD,20)); 

       b3.setForeground(new Color(255,255,255));
       b3.setBackground(new Color(0,64,64));
       b3.setFont(new Font("Arial",Font.BOLD,15)); 
       
	   b4.setForeground(new Color(255,255,255));
       b4.setFont(new Font("Arial",Font.BOLD,15)); 
       b4.setBackground(new Color(0,64,64));
       
	  // b5.setForeground(new Color(255,255,255));
     //  b5.setFont(new Font("Arial",Font.BOLD,15)); 
      // b5.setBackground(new Color(0,64,64));
       
	   b8.setForeground(new Color(255,255,255));
       b8.setFont(new Font("Arial",Font.BOLD,15)); 
       b8.setBackground(new Color(0,64,64));
       
       /*b9.setForeground(new Color(255,255,255));
       b9.setFont(new Font("Arial",Font.BOLD,15)); 
       b9.setBackground(new Color(0,64,64));
       
       b10.setForeground(new Color(255,255,255));
       b10.setFont(new Font("Arial",Font.BOLD,15)); 
       b10.setBackground(new Color(0,64,64));*/
       


       b3.addActionListener(this);
       b4.addActionListener(this);
       //b5.addActionListener(this);
       b8.addActionListener(this);
       //b10.addActionListener(this);
       //b9.addActionListener(this);
       

       
	   c1.add(l);
	   c1.add(l2);
	   c1.add(l3);

   //    c1.add(b5);
       c1.add(b4);
       c1.add(b3);
	   c1.add(b8);
	 //  c1.add(b9);
	//   c1.add(b10);
      

       setSize(500,600);
       setVisible(true);
	}
public void actionPerformed(ActionEvent ae)
         {
               if(ae.getSource()==b5)
                { 
			   Insert1 d=new Insert1();
			   d.setSize(700,600);
			   d.setVisible(true);
			   }
       if(ae.getSource()==b3)
                {
		   System.out.println("Face Framing page opening");
	    faceIdMain1 f1=new faceIdMain1();
		f1.setSize(800,800);
		f1.setVisible(true);
			   
	        }
             			 
			  if(ae.getSource()==b8)
                {
	   Draw d1=new Draw();
		d1.setSize(600,400);
		d1.setVisible(true);
			   
	        }
      
			 if(ae.getSource()==b9)
                {
	   MatchingImg mi=new MatchingImg();
		mi.setSize(700,600);
		mi.setVisible(true);
			   
	        }
			 
			 if(ae.getSource()==b10)
                {
	   DatafromOp da=new DatafromOp();
		da.setSize(600,400);
		da.setVisible(true);
			   
	        }
			 
			 
			 
			 if(ae.getSource()==b4)
                { 
			Retr r1=new Retr();
			   r1.setSize(600,600);
			   r1.setVisible(true);
			 }
             
         }
       public static void main(String args[])
        {
        Operator op= new Operator();
       }}
