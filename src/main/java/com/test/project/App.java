package com.test.project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.controller.FindUserHql;
import com.test.hib.model.User;
public class App
{
    public static void main( String[] args )
    {
        FindUserHql u = new FindUserHql();
        u.findUser();
        u.findUserSelect();
        u.getRecordbyId();
        u.getmaxSalary();

    }
}
