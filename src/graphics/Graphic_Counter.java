package graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import datas.*;
import exception.LimitReachedException;

public class Graphic_Counter extends JFrame{
	
	private static final long serialVersionUID = -6689215102942231548L;
	//ATTRIBUTS
	private Container container;
	private FlowLayout layout;
	private JPanel jpanel;
	
	private JLabel counterLabel;
	private JTextField counterText;
	private JButton add;
	private JButton remove;
	
	private JLabel exceptionText;
	private Counter counter;
	
	public Graphic_Counter() {
		super("Counter Interface");
		initGraphics();
		pack();
		
	}
	//Initialisation des composants
	public void initGraphics() {
		//Cr�ation des composants
		counter = new CyclicCounter(5, 10);
		container = this.getContentPane();
		layout = new FlowLayout();
		jpanel = new JPanel();
		counterLabel = new JLabel("Counter");
		counterText = new JTextField(counter.stringValues());
		counterText.setEditable(false);
		exceptionText = new JLabel("No exception");
		
		//param�trage des boutons
		add = new JButton("Increase");
		remove = new JButton("Decrease");
		add.addActionListener(new Increase());
		remove.addActionListener(new Decrease());
		//Ajustement des param�tres du layout
		jpanel.setLayout(layout);
		counterText.setPreferredSize(new Dimension(100, 20));
		jpanel.setPreferredSize(new Dimension(350,60));
		//Ajout des composants au jpanel
		jpanel.add(counterLabel);
		jpanel.add(counterText);
		jpanel.add(add);
		jpanel.add(remove);
		jpanel.add(exceptionText);
		//Ajout du jpanel au container
		container.add(jpanel);
	}
	//Ajustement de la fenetre (pack, visible, close operation etc...)
	public void pack() {
		//Permet de pack tous les �l�ments ensemble
		super.pack();
		//Permet de rendre visible/invisible l'interface
		this.setVisible(true);
		//D�fini l'op�ration de fermeture par d�faut
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Permet de d�finir si la taille de l'interface peut �tre modifi�e
		this.setResizable(false);
		//Permet de d�finir la position relative par rapport � une autre fenetre
		this.setLocationRelativeTo(null);
	}
	//Boutton d'incr�mentation du compteur
	class Increase implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				//incr�menter le compteur
				counter.increase();
				//modifier le Texte pour correspondre � la nouvelle valeur du compteur
				counterText.setText(counter.stringValues());
				//Modifier le texte de l'exception (pour le remettre par d�faut)
				exceptionText.setText("no exception");
				//Si LRE attrap�e, modifier le texte de l'exception
			} catch (LimitReachedException e) {exceptionText.setText("Can't increase anymore");}
		}
	}
	//Boutton de d�cr�mentation du compteur
	class Decrease implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				//D�cr�menter le compteur
				counter.decrease();
				//modifier le Texte pour correspondre � la nouvelle valeur du compteur
				counterText.setText(counter.stringValues());
				//Modifier le texte de l'exception (pour le remettre par d�faut)
				exceptionText.setText("no exception");
				//Si LRE attrap�e, modifier le texte de l'exception
			} catch (LimitReachedException e) {exceptionText.setText("Can't decrease anymore");}
		}
	}
}












