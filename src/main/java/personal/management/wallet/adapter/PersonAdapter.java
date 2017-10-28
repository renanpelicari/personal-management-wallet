package personal.management.wallet.adapter;

import org.springframework.util.Assert;
import personal.management.wallet.model.entity.Person;
import personal.management.wallet.vo.request.PersonRequestVo;
import personal.management.wallet.vo.response.PersonResponseVo;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Adapter for {@link Person} and {@link PersonResponseVo}
 */
public class PersonAdapter {

    /**
     * Convert {@link PersonResponseVo} into {@link Person}
     *
     * @param vo the PersonRequestVo
     * @return the person model
     */
    public static Person voToModel(final PersonRequestVo vo) {
        Assert.notNull(vo, "The PersonRequestVo cannot be null!");
        Assert.notNull(vo.getFullName(), "The full name is required!");
        return Person.builder().fullName(vo.getFullName()).build();
    }

    /**
     * Convert {@link Person} into {@link PersonResponseVo}
     *
     * @param model the person entity
     * @return the person response vo
     */
    public static PersonResponseVo modelToVo(final Person model) {
        Assert.notNull(model, "The Person cannot be null!");
        Assert.notNull(model.getId(), "The ID is required!");
        Assert.notNull(model.getFullName(), "The full name is required!");
        return PersonResponseVo.builder()
            .id(model.getId())
            .fullName(model.getFullName())
            .build();
    }

    /**
     * Convert {@link Person} list into {@link PersonResponseVo} list
     *
     * @param people the person entity list
     * @return the person response vo list
     */
    public static List<PersonResponseVo> modelToVo(final HashSet<Person> people) {
        Assert.notEmpty(people, "The Person list cannot be null!");
        return people.stream().map(PersonAdapter::modelToVo).collect(Collectors.toList());
    }
}
