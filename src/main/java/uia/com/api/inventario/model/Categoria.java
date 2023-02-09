package uia.com.api.inventario.model;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;

@Node("Categoria")
public class Categoria {
    @Id
    private String id;

    @Property("name")
    private String name;

    @Property("estatus")
    private String estuatus;

    @Property("descripcion")
    private String descripcion;

    @Relationship(type = "AGREGADO")
    private ArrayList<Item> items = new ArrayList<Item>();

    public Categoria() {
    }

    public Categoria(String id, String name, String estuatus, String descripcion, ArrayList<Item> items) {
        this.id = id;
        this.name = name;
        this.estuatus = estuatus;
        this.descripcion = descripcion;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEstuatus() {
        return estuatus;
    }

    public void setEstuatus(String estuatus) {
        this.estuatus = estuatus;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
