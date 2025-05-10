package patterns.creational.abstractFactory;

public class GUI {
    private Button minimizeButton;
    private Button maximizeButton;
    private Button exitButton;
    private Checkbox autosaveCheckbox;

    public GUI(Button minimizeButton, Button maximizeButton, Button exitButton, Checkbox autosaveCheckbox) {
        this.minimizeButton = minimizeButton;
        this.maximizeButton = maximizeButton;
        this.exitButton = exitButton;
        this.autosaveCheckbox = autosaveCheckbox;
    }

    public Button getMinimizeButton() {
        return minimizeButton;
    }

    public Button getMaximizeButton() {
        return maximizeButton;
    }

    public Button getExitButton() {
        return exitButton;
    }

    public Checkbox getAutosaveCheckbox() {
        return autosaveCheckbox;
    }

    @Override
    public String toString() {
        return "GUI{" +
                "minimizeButton='" + minimizeButton.render() + '\'' +
                ", maximizeButton='" + maximizeButton.render() + '\'' +
                ", exitButton=" + exitButton.render() +
                ", autosaveCheckbox='" + autosaveCheckbox.render() + '\'' +
                '}';
    }
}
