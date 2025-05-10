package patterns.creational.abstractFactory;

public class GUIMaker {
    public static GUI createGUI(OS os) {
        if (os.equals(OS.WINDOWS)) {
            WindowsGUIFactory windowsGUIFactory = new WindowsGUIFactory();
            Button minimizeButton = windowsGUIFactory.createButton();
            Button maximizeButton = windowsGUIFactory.createButton();
            Button exitButton = windowsGUIFactory.createButton();
            Checkbox autosaveCheckbox = windowsGUIFactory.createCheckbox();
            return new GUI(minimizeButton, maximizeButton, exitButton, autosaveCheckbox);
        } else {
            MacGUIFactory macGUIFactory = new MacGUIFactory();
            Button minimizeButton = macGUIFactory.createButton();
            Button maximizeButton = macGUIFactory.createButton();
            Button exitButton = macGUIFactory.createButton();
            Checkbox autosaveCheckbox = macGUIFactory.createCheckbox();
            return new GUI(minimizeButton, maximizeButton, exitButton, autosaveCheckbox);
        }
    }
}
