import br.com.dio.ui.custom.frame.MainFrame;
import br.com.dio.ui.custom.panel.MainPanel;
import br.com.dio.ui.custom.screen.MainScreen;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class UIMain {

    public static void main(String[] args) {
        final var gameConfig = Stream.of(args)
                .collect(toMap(
                        arg -> arg.split(";")[0],
                        arg -> arg.split(";")[1]
                ));

        var mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainScreen();
    }
}
