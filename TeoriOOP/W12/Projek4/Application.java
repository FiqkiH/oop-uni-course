package TeoriOOP.W12.Projek4;

import java.util.ArrayList;

public class Application {
    ArrayList<User> users = new ArrayList();
    
    public void addUser(User p) {
        boolean exist = false;
        for (User p1 : users) {
            if (p1.getID().equals(p.getID())) {
                throw new UserAlreadyExists("User " + p.getID() + " already exists", p.getID(), p.getName());
            }        
        } 
        users.add(p);
    }
}
