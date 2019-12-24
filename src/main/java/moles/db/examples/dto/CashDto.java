package moles.db.examples.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import moles.db.examples.entities.Cash;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CashDto implements EntityToDto<Cash, CashDto> {

    private Integer id;
    private LocalDateTime day;
    private String cash;
    private Double value;

    /**
     * Convert entity to dto
     *
     * @param entity entity
     * @return dto
     */
    @Override
    public CashDto toDto(Cash entity) {
        return CashDto.builder()
                .id(entity.getId())
                .day(entity.getDay())
                .cash(entity.getCash())
                .value(entity.getValue())
                .build();
    }
}
