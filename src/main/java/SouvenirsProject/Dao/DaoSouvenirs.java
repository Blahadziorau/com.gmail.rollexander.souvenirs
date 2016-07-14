package SouvenirsProject.Dao;

import SouvenirsProject.Entity.Country;
import SouvenirsProject.Entity.Producer;
import SouvenirsProject.Entity.Souvenir;

import java.util.List;

public interface DaoSouvenirs {

    //Вывести информацию о сувенирах заданного производителя.
    List<Souvenir> getInfoByProducer(List<Souvenir> souvenirs, Producer producer);

    // Вывести информацию о сувенирах, произведенных в заданной стране
    List<Souvenir> getInfoByCountry(List<Souvenir> souvenirs, Country country);

    //Вывести информацию о производителях, чьи цены на сувениры меньше заданной.
    List<Producer> getInfoProducerByPrice(List<Producer> producerList);

    //Вывести информацию о производителях заданного сувенира, произведенного в заданном году.
    Producer getInfoByManYDate(Souvenir souvenir);

    // Удалить заданного производителя и его сувениры.
    boolean delete(Producer producer);

}
