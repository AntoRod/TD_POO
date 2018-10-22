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
		//Création des composants
		counter = new CyclicCounter(5, 10);
		container = this.getContentPane();
		layout = new FlowLayout();
		jpanel = new JPanel();
		counterLabel = new JLabel("Counter");
		counterText = new JTextField(counter.stringValues());
		counterText.setEditable(false);
		exceptionText = new JLabel("No exception");
		
		//paramètrage des boutons
		add = new JButton("Increase");
		remove = new JButton("Decrease");
		add.addActionListener(new Increase());
		remove.addActionListener(new Decrease());
		//Ajustement des paramètres du layout
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
		//Permet de pack tous les éléments ensemble
		super.pack();
		//Permet de rendre visible/invisible l'interface
		this.setVisible(true);
		//Défini l'opération de fermeture par défaut
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Permet de définir si la taille de l'interface peut être modifiée
		this.setResizable(false);
		//Permet de définir la position relative par rapport à une autre fenetre
		this.setLocationRelativeTo(null);
	}
	//Boutton d'incrémentation du compteur
	class Increase implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				//incrémenter le compteur
				counter.increase();
				//modifier le Texte pour correspondre à la nouvelle valeur du compteur
				counterText.setText(counter.stringValues());
				//Modifier le texte de l'exception (pour le remettre par défaut)
				exceptionText.setText("no exception");
				//Si LRE attrapée, modifier le texte de l'exception
			} catch (LimitReachedException e) {exceptionText.setText("Can't increase anymore");}
		}
	}
	//Boutton de décrémentation du compteur
	class Decrease implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				//Décrémenter le compteur
				counter.decrease();
				//modifier le Texte pour correspondre à la nouvelle valeur du compteur
				counterText.setText(counter.stringValues());
				//Modifier le texte de l'exception (pour le remettre par défaut)
				exceptionText.setText("no exception");
				//Si LRE attrapée, modifier le texte de l'exception
			} catch (LimitReachedException e) {exceptionText.setText("Can't decrease anymore");}
		}
	}
}












