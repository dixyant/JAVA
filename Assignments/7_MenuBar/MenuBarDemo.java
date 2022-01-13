import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.*;  
import java.awt.event.*; 




class MenuBarDemo {

    public MenuBarDemo(){  
        Frame f = new Frame("Menu Bar");

        MenuBar mb = new MenuBar(); 

        Menu file, newOption, edit, view, open;

       

        //menu
        file = new Menu("File");
        edit = new Menu("Edit");
        view = new Menu("View");
        open = new Menu("Open");

        //Sub Menu
        newOption = new Menu("New");   
        
        
        MenuItem save, close, newFile, newFolder, window, panel;
        
        //menu items
        save = new MenuItem("Save");  
        close = new MenuItem("Close"); 
        window = new MenuItem("Window");
        panel = new MenuItem("Panel");

        //Sub items 
        newFile = new MenuItem("New File");  
        newFolder = new MenuItem("New Folder");  

        // adding file-items to file-menu
        file.add(newOption);  
        file.add(save);
        file.add(close);  

        // adding file-sub-items of file-menu
        newOption.add(newFile);  
        newOption.add(newFolder);

        // adding View-menu-items to View-menu
        view.add(window);
        view.add(panel);

        // adding Menu items to menu bar
        mb.add(file);
        mb.add(edit);
        mb.add(view);
        mb.add(open);

        f.setMenuBar(mb);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  


        //PopupMenu
        
        PopupMenu popup = new PopupMenu("Edit");   

        file = new Menu("file");  
        edit = new Menu("edit"); 
        view = new Menu("view");
        open = new Menu("open");

        popup.add(file);  
        popup.add(edit);  
        popup.add(view);
        popup.add(open);

        f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popup.show(f , e.getX(), e.getY());  
            }                 
        });  

        f.add(popup); 

        
        
        // dialog box

        
        Dialog d;    
        d = new Dialog(f , "Confirmation", false);  
        d.setLayout( new FlowLayout() );  
        Button b = new Button ("YES");  

        open.addActionListener (new ActionListener()
        {
            public void actionPerformed( ActionEvent ev )  
            {  
                d.setVisible(true);  
            }
        });

        b.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                d.setVisible(false);  
            }  
        });  
        
        d.add( new Label ("Do you want to open this program ?"));  
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true); 


        
    } 

    public static void main(String args[])  
        {  
            new MenuBarDemo();  
        }  
}
