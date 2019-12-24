package moles.db.examples.dto;

public interface EntityToDto<E, D> {

    /**
     * Convert entity to dto
     *
     * @param entity entity
     * @return dto
     */
    D toDto(E entity);
}
