/*
 * Copyright 2018 Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.udesc.ceplan.jacksonpradolima.exemplosaula.aula03;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class JComannderMain {

    @Parameter(names = {"--files", "-f"}, description = "Lista dos nomes dos arquivos separados por vírgula")
    public List<String> files = new ArrayList<>();
    @Parameter(names = {"--pattern", "-p"})
    public int pattern;

    public static void main(String[] args) {
        JComannderMain main = new JComannderMain();
        JCommander.newBuilder()
                .addObject(main)
                .build()
                .parse(args);
        main.run();
    }

    public void run() {
        System.out.println("Pattern: " + this.pattern);
        System.out.println("Files: ");

        for (String file : files) {
            System.out.println(file);
        }
    }
}
