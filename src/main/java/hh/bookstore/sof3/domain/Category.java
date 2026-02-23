package hh.bookstore.sof3.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryid;
    private String name;

    public Category() {
        name = null;
    }

    public Category(String name) {
        this.name = name;
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Category{");
        sb.append("categoryid=").append(categoryid);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

}
