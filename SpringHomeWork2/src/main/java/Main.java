import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Head head1 = context.getBean("headBean", Head.class);
        Head head2 = context.getBean("headBean", Head.class);
        Head head3 = context.getBean("headBean", Head.class);
        Hydra hydra = context.getBean("hydraBean", Hydra.class);

        hydra.listOfHead.add(head1);
        hydra.listOfHead.add(head2);
        hydra.listOfHead.add(head3);

        System.out.println(hydra.getName()+hydra.listOfHead);
    }
}
