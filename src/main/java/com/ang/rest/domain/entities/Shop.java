package com.ang.rest.domain.entities;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shop_id_seq")
    private Integer id;

    @Column(unique = true)
    private String name;


    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Shop)) return false;
        final Shop other = (Shop) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Shop;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        return result;
    }
}
