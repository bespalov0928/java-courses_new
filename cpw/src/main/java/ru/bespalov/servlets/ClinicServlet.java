package ru.bespalov.servlets;

import ru.lesson.clinic.Animal;
import ru.lesson.clinic.Dog;
import ru.lesson.clinic.Pet;
import ru.lesson.clinic.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClinicServlet extends HttpServlet {

    final List<Pet> pets = new CopyOnWriteArrayList<Pet>();
    final List<User> users = new CopyOnWriteArrayList<User>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.append(
                "<!DOCTYPE html>" +
                        "<html>" +
                        "<head>" +
                        "   <title>Clinic Pets</title>" +
                        "</head>" +
                        "<body>" +
                        "   <form action='" + req.getContextPath() + "/' method='post'>" +
                        "       Name : <input type='text' name='name'>" +
                        "       <input type='submit' value='Submit'>" +
                        "       NameUs : <input type='text' name='nameus'>" +
                        "       <input type='submit' value='addUs'>" +
                        "   </form>" +
                        this.viewPets() +
                        "</body>" +
                        "</html>"
        );
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if (name != "") {
            this.pets.add(new Dog(new Animal(name)));
        }


        String nameus = req.getParameter("nameus");
        if (nameus != null) {
            User user = new User(nameus, nameus);
            this.users.add(user);
        }

        doGet(req, resp);
    }

    private String viewPets() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p>Pets</p>");
        sb.append("<table style='border : 1px solid black'>");
        for (Pet pet : this.pets) {
            sb.append("<tr><td style='border:1px solid black'>").append(pet.getName()).append("</td></tr>");
        }
        for (User user : this.users) {
            sb.append("<tr><td style='border:1px solid black'>").append(user.getName()).append("</td></tr>");
        }
        sb.append("</table>");
        return sb.toString();
    }
}
