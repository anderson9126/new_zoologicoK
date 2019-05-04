/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoologicok.resources;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author Julian
 */
@ApplicationPath("/api")
public class ApplicationConfig extends Application{
    
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources){
        resources.add(co.edu.konrad.zoologicok.resources.AnimalResource.class);
        resources.add(co.edu.konrad.zoologicok.resources.CuidadorResource.class);
        resources.add(co.edu.konrad.zoologicok.resources.LugarResource.class);
        resources.add(co.edu.konrad.zoologicok.resources.ProgramacionResource.class);
        resources.add(co.edu.konrad.zoologicok.resources.ShowResource.class);
        resources.add(co.edu.konrad.zoologicok.resources.TipoAnimalResource.class);
    }
}
