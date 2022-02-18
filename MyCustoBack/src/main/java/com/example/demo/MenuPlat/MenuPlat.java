package com.example.demo.MenuPlat;
import com.example.demo.Menu.Menu;
import com.example.demo.Plat.Plat;
import javax.persistence.*;



@Entity
public class MenuPlat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Menu m;


    @ManyToOne
    private Plat p;

    public MenuPlat(Menu m, Plat p) {
        this.m = m;
        this.p = p;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Menu getM() {
        return m;
    }

    public void setM(Menu m) {
        this.m = m;
    }

    public Plat getP() {
        return p;
    }

    public void setP(Plat p) {
        this.p = p;
    }
}