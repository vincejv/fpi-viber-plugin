/*************************************************************************
 * FPI Application - Abavilla                                            *
 * Copyright (C) 2022  Vince Jerald Villamora                            *
 *                                                                       *
 * This program is free software: you can redistribute it and/or modify  *
 * it under the terms of the GNU General Public License as published by  *
 * the Free Software Foundation, either version 3 of the License, or     *
 * (at your option) any later version.                                   *
 *                                                                       *
 * This program is distributed in the hope that it will be useful,       *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 * GNU General Public License for more details.                          *
 *                                                                       *
 * You should have received a copy of the GNU General Public License     *
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.*
 *************************************************************************/

package com.abavilla.fpi.viber.ext.dto;

import com.abavilla.fpi.fw.dto.AbsFieldDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@RegisterForReflection
public class Sender extends AbsFieldDto {

  private String id;

  private String name;

  @JsonProperty("avatar")
  private String avatarUrl;

  private String language;

  private String country;

  @JsonProperty("api_version")
  private Integer apiVersion;

  @JsonProperty("primary_device_os")
  private String deviceOS;

  @JsonProperty("viber_version")
  private String viberVersion;

  private Integer mcc;

  private Integer mnc;

  @JsonProperty("device_type")
  private String deviceType;

}
