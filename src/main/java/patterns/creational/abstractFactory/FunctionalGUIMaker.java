package patterns.creational.abstractFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FunctionalGUIMaker {

    private static final Map<OS, Supplier<GUIFactory>> guiFactoryMap = new HashMap<>();

    static {
        guiFactoryMap.put(OS.WINDOWS, WindowsGUIFactory::new);
        guiFactoryMap.put(OS.MAC, MacGUIFactory::new);
    }
    public static GUI createGUI(OS os) {
        GUIFactory guiFactory = guiFactoryMap.get(os).get();
        Button minimizeButton = guiFactory.createButton();
        Button maximizeButton = guiFactory.createButton();
        Button exitButton = guiFactory.createButton();
        Checkbox autosaveCheckbox = guiFactory.createCheckbox();
        return new GUI(minimizeButton, maximizeButton, exitButton, autosaveCheckbox);
    }
}
