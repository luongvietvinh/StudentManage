package quanLyStudent.service;

import quanLyStudent.model.Studen;

import java.util.ArrayList;
import java.util.List;

public class ServiceStudenInterface implements StudenInterface {
    private static   List<Studen> listStuden = new ArrayList<>();

    @Override
    public List<Studen> findAll() {
        return listStuden;
    }

    @Override
    public void save(Studen studen) {
        listStuden.add(studen);
    }

    @Override
    public void edit(int id, Studen studen) {
        listStuden.set(id, studen);
    }

    @Override
    public void delete(int id) {
        listStuden.remove(id);
    }

    @Override
    public void search(int id) {
        listStuden.get(id);
    }

    @Override
    public void sort() {
        findAll();
    }

}
