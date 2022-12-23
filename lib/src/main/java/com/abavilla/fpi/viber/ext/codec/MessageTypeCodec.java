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

package com.abavilla.fpi.viber.ext.codec;

import com.abavilla.fpi.fw.codec.AbsEnumCodec;
import com.abavilla.fpi.viber.ext.dto.Message;

/**
 * MongoDB Codec for {@link Message.Type} enum.
 *
 * @author <a href="mailto:vincevillamora@gmail.com">Vince Villamora</a>
 */
public class MessageTypeCodec extends AbsEnumCodec<Message.Type> {

  /**
   * {@inheritDoc}
   */
  @Override
  public Class<Message.Type> getEncoderClass() {
    return Message.Type.class;
  }
}
