import java.util.Formatter;
import java.io.FileNotFoundException;
import java.io.*;
import java.io.FileWriter;
import java.lang.NullPointerException;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FormFillup extends JFrame implements ActionListener{
	private String[] choose ={"Bangladesh","India","Pakistan","Srilanka","Nepal","others"};
	private String[] b_group = {"A+","A-","B+","B-","AB+","AB-","O+","O-"};
	private String[] dept={"Computer Science & Engineering","Electrical & Electronics Engineering","Applied Chemistry & Chemical Engineering","Information & Communication Engineering","Material Science & Engineering"};
	private String[] district={"Rajshahi","Chittagong","Dhaka","Kulna","Barishal","Jessor"};
	private JLabel namelvl,f_name,m_name,mobilelvl,rolllvl,deptlvl,adresslvl,genderlvl,nationalitylvl,villlvl,districtlvl,pstlvl,academiclvl,ssclvl,hsclvl,hp_year,sp_year,hgpa,sgpa,sscroll,hscroll,scl,clg,reg;
	private JTextField nametf,f_tf,m_tf,mobile_tf,roll_tf,dept_tf,address_tf,vill_tf,pst_tf,district_tf,sscroll_tf,hscroll_tf,sscgpa_tf,hscgpa_tf,scl_tf,clg_tf,reg_tf;
	private JPasswordField p1,p2;
	private JScrollPane scroll;
	private JCheckBox cb1;
	private JComboBox nationcobx,deptCobx,districtcobx,ssccombx,hsccombx;
	private JRadioButton male_rb,female_rb;
	private ImageIcon icon;
	private JButton b1,b2;
	private ButtonGroup grp;
	private Container ct;
	public String n8;
	public String[] year={"2018","2017","2016","2015","2014","2013","2012","2011"};
	
	FormFillup(){
		
		Font f = new Font("Arial",Font.BOLD,18);
		Font f1 = new Font("Arial",Font.BOLD,24);
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(200,50,1500,920);
        setTitle("Student Information");
		setResizable(false);		

		
		
		ct= this.getContentPane();
		ct.setLayout(null);
		//ct.setBackground(Color.YELLOW);
		
	
		
		
		
		namelvl = new JLabel("Name");
		namelvl.setBounds(50,65,150,20);
		namelvl.setFont(f);
		ct.add(namelvl);
		
		f_name = new JLabel("Father`s Name");
		f_name.setBounds(50,135,150,20);
		f_name.setFont(f);
		ct.add(f_name);
		
		m_name = new JLabel("Mother`s Name");
		m_name.setBounds(50,205,150,20);
		m_name.setFont(f);
		ct.add(m_name);
		
		mobilelvl = new JLabel("Mobile number");
		mobilelvl.setBounds(50,275,150,20);
		mobilelvl.setFont(f);
		ct.add(mobilelvl);
		
		rolllvl = new JLabel("Roll/ID No");
		rolllvl.setBounds(50,345,150,20);
		rolllvl.setFont(f);
		ct.add(rolllvl);
		
		
		deptlvl= new JLabel("Dept name");
		deptlvl.setBounds(50,415,150,20);
		deptlvl.setFont(f);
		ct.add(deptlvl);
		
		
		adresslvl = new JLabel("Address");
		adresslvl.setBounds(50,485,150,20);
		adresslvl.setFont(f);
		ct.add(adresslvl);
		
		villlvl = new JLabel("Vill");
		villlvl.setBounds(300,500,100,20);
		villlvl.setFont(f);
		ct.add(villlvl);
		
		pstlvl = new JLabel("Post");
		pstlvl.setBounds(500,500,100,20);
		pstlvl.setFont(f);
		ct.add(pstlvl);
		
		districtlvl = new JLabel("District");
		districtlvl.setBounds(300,560,150,20);
		districtlvl.setFont(f);
		ct.add(districtlvl);
		
		genderlvl = new JLabel("Gender");
		genderlvl.setBounds(50,630,150,20);
		genderlvl.setFont(f);
		ct.add(genderlvl);
		
		nationalitylvl = new JLabel("Nationality");
		nationalitylvl.setBounds(50,700,150,20);
		nationalitylvl.setFont(f);
		ct.add(nationalitylvl);
		
		academiclvl = new JLabel("Academic Information :");
		academiclvl.setBounds(850,65,300,20);
		academiclvl.setFont(f1);
		ct.add(academiclvl);
		
		hsclvl = new JLabel("HSC");
		hsclvl.setBounds(850,135,150,20);
		hsclvl.setFont(f);
		ct.add(hsclvl);
		
		hscroll = new JLabel("Roll");
		hscroll.setBounds(950,205,150,20);
		hscroll.setFont(f);
		ct.add(hscroll);
		
		hgpa = new JLabel("GPA");
		hgpa.setBounds(1250,205,150,20);
		hgpa.setFont(f);
		ct.add(hgpa);
		
		hp_year = new JLabel("Passing year");
		hp_year.setBounds(950,275,150,20);
		hp_year.setFont(f);
		ct.add(hp_year);
		
		scl = new JLabel("College name");
		scl.setBounds(950,345,150,20);
		scl.setFont(f);
		ct.add(scl);
		
		ssclvl = new JLabel("SSC");
		ssclvl.setBounds(850,415,150,20);
		ssclvl.setFont(f);
		ct.add(ssclvl);
		
		sscroll = new JLabel("Roll");
		sscroll.setBounds(950,495,150,20);
		sscroll.setFont(f);
		ct.add(sscroll);
		
		sgpa = new JLabel("GPA");
		sgpa.setBounds(1250,495,150,20);
		sgpa.setFont(f);
		ct.add(sgpa);
		
		sp_year = new JLabel("Passing year");
		sp_year.setBounds(950,565,150,20);
		sp_year.setFont(f);
		ct.add(sp_year);
		
		clg = new JLabel("School name");
		clg.setBounds(950,630,150,20);
		clg.setFont(f);
		ct.add(clg);
		
		reg = new JLabel("Reg no");
		reg.setBounds(850,700,150,20);
		reg.setFont(f);
		ct.add(reg);
		
		nametf = new JTextField();
		nametf.setBounds(300,50,400,50);
		nametf.setFont(f);
		ct.add(nametf);
		
		f_tf = new JTextField();
		f_tf.setBounds(300,120,400,50);
		f_tf.setFont(f);
		ct.add(f_tf);
		
		m_tf = new JTextField();
		m_tf.setBounds(300,190,400,50);
		m_tf.setFont(f);
		ct.add(m_tf);
		
		mobile_tf = new JTextField();
		mobile_tf.setBounds(300,260,400,50);
		mobile_tf.setFont(f);
		ct.add(mobile_tf);
		
		roll_tf = new JTextField();
		roll_tf.setBounds(300,330,400,50);
		roll_tf.setFont(f);
		ct.add(roll_tf);
			
		deptCobx = new JComboBox(dept);
		deptCobx.setBounds(300,400,400,50);
		deptCobx.setEditable(true);
		deptCobx.setFont(f);
		ct.add(deptCobx);
		
		vill_tf = new JTextField();
		vill_tf.setBounds(350,485,100,50);
		vill_tf.setFont(f);
		ct.add(vill_tf);
		
		pst_tf = new JTextField();
		pst_tf.setBounds(560,485,100,50);
		pst_tf.setFont(f);
		ct.add(pst_tf);
		
		districtcobx = new JComboBox(district);
		districtcobx.setBounds(400,550,150,50);
		districtcobx.setFont(f);
		ct.add(districtcobx);
		
		male_rb = new JRadioButton("Male");
		male_rb.setBounds(300,610,100,50);
		male_rb.setFont(f);
		ct.add(male_rb);
		
		female_rb = new JRadioButton("Female");
		female_rb.setBounds(400,610,100,50);
		female_rb.setFont(f);
		ct.add(female_rb);
		
		nationcobx = new JComboBox(choose);
		nationcobx.setBounds(300,680,150,50);
		nationcobx.setEditable(true);
		nationcobx.setFont(f);
		ct.add(nationcobx);
		
		cb1 = new JCheckBox("I accept all rules of your offical term");
		cb1.setBounds(50,760,450,20);
		cb1.setFont(f);
		ct.add(cb1);
		
		hscroll_tf = new JTextField();
		hscroll_tf.setBounds(1020,195,200,50);
		hscroll_tf.setFont(f);
		ct.add(hscroll_tf);
		
		hscgpa_tf = new JTextField();
		hscgpa_tf.setBounds(1300,195,100,50);
		hscgpa_tf.setFont(f);
		ct.add(hscgpa_tf);
		
		hsccombx = new JComboBox(year);
		hsccombx.setBounds(1080,265,100,50);
		hsccombx.setFont(f);
		hsccombx.setEditable(true);
		ct.add(hsccombx);
		
		sscroll_tf = new JTextField();
		sscroll_tf.setBounds(1020,485,200,50);
		sscroll_tf.setFont(f);
		ct.add(sscroll_tf);
		
		sscgpa_tf = new JTextField();
		sscgpa_tf.setBounds(1300,485,100,50);
		sscgpa_tf.setFont(f);
		ct.add(sscgpa_tf);
		
		
		ssccombx = new JComboBox(year);
		ssccombx.setBounds(1080,555,100,50);
		ssccombx.setFont(f);
		ssccombx.setEditable(true);
		ct.add(ssccombx);
		
		reg_tf = new JTextField();
		reg_tf.setBounds(950,690,530,50);
		reg_tf.setFont(f);
		ct.add(reg_tf);
		
		scl_tf = new JTextField();
		scl_tf.setBounds(1080,335,400,50);
		scl_tf.setFont(f);
		ct.add(scl_tf);
		
		clg_tf = new JTextField();
		clg_tf.setBounds(1080,620,400,50);
		clg_tf.setFont(f);
		ct.add(clg_tf);
		
		grp = new ButtonGroup();
		
		b1 = new JButton("Submit");
		b1.setBounds(550,800,150,40);
		b1.setFont(f);
		//b1.setBackground(Color.YELLOW);
		ct.add(b1);
		
		b2 = new JButton("Clear");
		b2.setBounds(900,800,100,40);
		b2.setFont(f);
		//b2.setBackground(Color.YELLOW);
		ct.add(b2);
		
		grp.add(male_rb);
		grp.add(female_rb);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		cb1.addActionListener(this);
		
		}
		public void actionPerformed(ActionEvent e){
				
        String n1=nametf.getText();
        String n2=f_tf.getText();
		String n3=m_tf.getText();
		String n4=mobile_tf.getText();
		String n5=roll_tf.getText();
		//String n6=deptCobx.getText();
		//String n7=tf7.getText();
		
		//String n9=cb1.getText();
		if(male_rb.isSelected()){
			
			n8 = "Male";
			
			
		}
		else if(female_rb.isSelected()){
			
			
			n8 = "Female";
			
			
		}
		
	    if(e.getSource()==b1){
        
				
				JOptionPane.showMessageDialog(null,"You are successfully Registered");
				try{
				BufferedWriter f = new BufferedWriter(new FileWriter("C:/Users/user/StudentInfo.txt",true));
				f.write(""+n1+";"+n2+";"+n3+";"+n4+";"+n5+";"+n8+";");
				f.write(""+deptCobx.getSelectedItem()+";");
				f.write(""+vill_tf.getText()+";");
				f.write(""+pst_tf.getText()+";"+districtcobx.getSelectedItem()+";");
				f.write(""+nationcobx.getSelectedItem()+";");
				f.write(""+hscroll_tf.getText()+";"+hscgpa_tf.getText()+""+hsccombx.getSelectedItem()+";"+sscroll_tf.getText()+";"+sscgpa_tf.getText()+""+ssccombx.getSelectedItem()+";");
				f.write(""+clg_tf.getText()+";"+scl_tf.getText()+";"+reg_tf.getText()+";");
				f.write("\r\n");
				f.close();
				}
				catch(FileNotFoundException ex){
					
					System.out.println(ex);
				}
				catch(NullPointerException ex2){
					
					System.out.println(ex2);
				}
				catch(Exception ex3){
					
					System.out.println(ex3);
				}
				nametf.setText("");
				f_tf.setText("");
				m_tf.setText("");
				mobile_tf.setText("");
				roll_tf.setText("");
				sscroll_tf.setText("");
				hscroll_tf.setText("");
				hscgpa_tf.setText("");
				sscgpa_tf.setText("");
				vill_tf.setText("");
				pst_tf.setText("");
				scl_tf.setText("");
				clg_tf.setText("");
				reg_tf.setText("");
				
				

		}	
		else if(e.getSource()==b2)
        {
         
			nametf.setText("");
			f_tf.setText("");
			m_tf.setText("");
			mobile_tf.setText("");
			roll_tf.setText("");
			sscroll_tf.setText("");
			hscroll_tf.setText("");
			hscgpa_tf.setText("");
			sscgpa_tf.setText("");
			vill_tf.setText("");
			pst_tf.setText("");
			scl_tf.setText("");
			clg_tf.setText("");
			reg_tf.setText("");
			
			
	
		}
	}
	public static void main(String[] args){
	
		FormFillup frm = new FormFillup();
		frm.setVisible(true);
		
	
	
	
	}
		
}