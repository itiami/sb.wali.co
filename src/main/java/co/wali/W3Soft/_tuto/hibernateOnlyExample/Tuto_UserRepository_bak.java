package co.wali.W3Soft._tuto.hibernateOnlyExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.wali.W3Soft.user.UserModel;

@Repository
public class Tuto_UserRepository_bak {
    @Autowired
    private SessionFactory sessionFactory;

    public UserModel findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(UserModel.class, id);
        }
    }
}
