package phone.agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Person> agendContent = new ArrayList<>();

    /*
    this methdo should add a created person in agenda
    minimal checks should be don

        1. p has name
        2. p has phone number

    If one field is not defined, a message should be displayed and person is not added in agenda.

    Before adding the person in agenda, check that the number and name does not exists
     */
    public void addNumberInAgenda(Person p) {

    }

    /*
    Remove a person from agenda

    Minimal checks made for the person to be removed
        1. p has name
        2. p has phone number

     */
    public void removePersonFromAgenda(Person p) {

    }

    /*
    Those 2 parameters represents:
        phoneNumber -- phone number of the person to whom we want to update the name
        name -- name that we want to use to update the name of the
     */
    public void updatePhoneNumberInAgenda(String phoneNumeber, String name) {

    }

    public void updateNameOfPersonFromAgenda(String phoneNumeber, String nameToUpdate) {

    }

    /*
    Return a NEW array list, that contains the agenda sorted by name
     */
    public ArrayList<Person> getAgendaSortedByName() {

        return null;
    }

    public ArrayList<Person> getAgendContent() {
        return this.agendContent;
    }

}
