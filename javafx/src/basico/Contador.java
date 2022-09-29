package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{
	
	private int contador = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		Button botaoIncremento = new Button("+");
		botaoIncremento.setOnAction(e -> {
			contador++;
			labelNumero.setText(Integer.toString(contador));
		});
		
		Button botaoDecremento = new Button("-");
		botaoDecremento.setOnAction(e -> {
			contador --;
			labelNumero.setText(Integer.toString(contador));
		});
		
		HBox boxBotoes = new HBox();
		boxBotoes.setSpacing(10);
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox boxConteudo = new VBox();
		boxConteudo.setSpacing(10);
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		boxConteudo.getStyleClass().add("conteudo");
		
		String caminhoDoCSS = getClass().getResource("/basico/Contador.css").toExternalForm();
		
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoDoCSS);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald:wght@200;400&display=swap");
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
