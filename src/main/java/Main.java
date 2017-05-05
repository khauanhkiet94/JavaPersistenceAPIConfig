import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//hello
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xxx");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
//        entityManager.persist(new User("petya","123"));
//        entityManager.persist(new User("kolya","123"));
//        entityManager.persist(new User("masha","123"));
//        entityManager.persist(new User("saha","123"));

//        User user = entityManager.find(User.class, 2);
//        System.out.println(user);

//        Query query = entityManager.createNativeQuery("select * from USER ",User.class);
//        List <User>resultList = query.getResultList();
//        System.out.println(resultList);

//        TypedQuery<User> query = entityManager.createQuery("select u from User u where u.id > 2", User.class);
//        List<User> resultList = query.getResultList();
//        System.out.println(resultList);

//        User u1 = entityManager.find(User.class, 1);
//        u1.setName("tro");

//        User newUser = new User("qwe","123123123");
//        newUser.setId(1);
//
//        entityManager.merge(newUser);


//        entityManager.remove(entityManager.find(User.class,1));

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
