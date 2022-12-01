package org.spider;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  {
    @ExcelProperty("Name")
    private String name;
    @ExcelProperty("Sex")
    private String sex;
    @ExcelProperty("ProfessionalTitle")
    private String post;
    @ExcelProperty("ResearchInterests")
    private String interest;
}
