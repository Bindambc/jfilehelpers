/*
 * TestFixed.java
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
package com.jfilehelpers.samples.fixed.lesschars;

import com.jfilehelpers.engines.FileHelperEngine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TestFixed {
    public static void main(String[] args) throws IOException {
        FileHelperEngine<Track> engine = new FileHelperEngine<Track>(Track.class);
        List<Track> tracks = new ArrayList<Track>();

        if (args.length < 1) {
            tracks = engine.readResource("/samples/tracks-fixed.txt");
        } else {
            tracks = engine.readFile(args[0]);
        }

        for (Track t : tracks) {
            System.out.println(t);
        }
    }
}
