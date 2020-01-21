/**
 * Copyright (c) 2020 by CodeCoda Ltd.
 * http://www.codecoda.com
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information
 * of CodeCoda Ltd. You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with CodeCoda Ltd.
 * <p>
 * Created by genchev: 2020
 */
package one.genchev.mongodocker.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class Product implements Serializable {

    @Id
    private String id;
    private String name;
}
