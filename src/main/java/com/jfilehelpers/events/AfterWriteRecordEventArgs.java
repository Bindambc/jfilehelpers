/*
 * AfterWriteRecordEventArgs.java
 *
 * Copyright (C) 2007 Felipe Gon�alves Coury <felipe.coury@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package com.jfilehelpers.events;

/**
 * @param <T> the data record type
 * @author Robert Eccardt
 */
public class AfterWriteRecordEventArgs<T> extends WriteRecordEventArgs<T> {
    private String recordLine;

    public AfterWriteRecordEventArgs(T record, int lineNumber, String recordLine) {
        super(record, lineNumber);
        this.recordLine = recordLine;
    }

    public String getRecordLine() {
        return recordLine;
    }

    public void setRecordLine(String recordLine) {
        this.recordLine = recordLine;
    }


}
