package quanLyStudent.service;

import quanLyStudent.model.Studen;

import java.util.List;

public interface StudenInterface {
   List<Studen> findAll();

    public void save(Studen studen);

    public void edit(int id , Studen studen);

    public void delete(int id);

    public void search(int id);

    public void sort();


}
