package TeoriOOP.W4.Driver3;

public class Window {
    private Scrollbar scBar;
    private Titlebar tlBar;
    private Menu[] menu;

    public Window(String title, String scrollType, int numMenu) {
        scBar = new Scrollbar(scrollType);
        tlBar = new Titlebar(title);
        menu = new Menu[numMenu];
    }
}
