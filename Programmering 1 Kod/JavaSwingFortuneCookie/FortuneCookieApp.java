package JavaSwingFortuneCookie.FortuneCookieApp.src;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class FortuneCookieApp extends JFrame {
    // Skapa en array av tio slumpmässiga fraser
    private final String[] fortunes = {
            "En god vän är en skatt.",
            "Ett ljust hjärta tar dig genom alla svåra tider.",
            "En person är aldrig för gammal för att lära sig.",
            "Allt ditt hårda arbete kommer snart att ge avkastning.",
            "Att komma utanför sin bekvämlighetszon är ett bra sätt att verkligen känna sig obekväm",
            "Dröm stort och våga misslyckas.",
            "Följ dina drömmar och de kommer att leda dig till lycka.",
            "Godis kommer till den som väntar.",
            "Den största risken är att inte ta någon.",
            "Snart kommer du att omges av goda vänner och skratt."
    };
    // Skapa en JLabel för fortune cookie-bilden och en JButton för att öppna fortune cookie
    private JLabel fortuneCookieImg;
    private JButton fortuneButton;

    // Skapa en konstruktor för att lägga till fortune cookie-bilden och knappen till ramen
    public FortuneCookieApp() {
        super("Fortune Cookie App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Skapa en JLabel för fortune cookie-bilden och lägg till en kant runt bilden
        fortuneCookieImg = new JLabel(new ImageIcon("fortune_cookie.png"));
        add(fortuneCookieImg, BorderLayout.NORTH);

        // Skapa en knapp för att öppna fortune cookie och lägg till en ActionListener för att visa frasen
        fortuneButton = new JButton("Öppna fortune cookie");
        // Actionlistener är det som sparkar igång funktionen showFortune som i sin tyr generar ett nytt fönster med det innehåll beskrivet i funktionen.
        fortuneButton.addActionListener(e -> showFortune());
        add(fortuneButton, BorderLayout.CENTER);

        // Ange storleken på ramen, placera den mitt i skärmen och gör den synlig
        setSize(800, 800);

        // Dessa båda rader centrerar fönstret och gör det synligt.
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Skapa en metod för att visa fortune cookie-frasen
    private void showFortune() {
        // Välj en slumpmässig fras från arrayen
        String fortune = fortunes[new Random().nextInt(fortunes.length)];
        // Skapa en ny ram för att visa fortune cookie-frasen
        JFrame fortuneFrame = new JFrame("FortuneCookieQuote");
        fortuneFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Skapa en JLabel för fortune cookie-papperet
        ImageIcon imageIcon = new ImageIcon("fortune_cookie_paper.jpg");
        JLabel imageLabel = new JLabel(imageIcon);

        // Skapa en JLabel för frasen, ställ in dess typsnitt och färg och placera den i mitten
        JLabel textLabel = new JLabel(fortune);

        //Ändrar attribut på font.
        textLabel.setFont(new Font("Arial", Font.BOLD, 24));
        textLabel.setForeground(Color.black);
        textLabel.setHorizontalAlignment(JLabel.CENTER);

        // Skapa en JPanel för att visa fortune cookie-papperet och lägg till JLabel med frasen
        // JPanel använs som en mapp för att sammla innehållet i fönstrett.
        JPanel showFortunePanel = new JPanel(new BorderLayout());

        showFortunePanel.add(textLabel, BorderLayout.CENTER);
        showFortunePanel.setOpaque(false);
        showFortunePanel.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());

        imageLabel.setLayout(null);
        imageLabel.add(showFortunePanel);

        fortuneFrame.getContentPane().add(imageLabel);
        fortuneFrame.pack();
        fortuneFrame.setLocationRelativeTo(null);
        fortuneFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new FortuneCookieApp();
    }
}
