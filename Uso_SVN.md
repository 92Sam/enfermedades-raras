#sincronizacion con svn

Pasos para usar el svn correctamente:

1º hacer checkout del trunk
2º hacer las modificaciones de codigo, se recomienda que no haya dos personas programando sobre la misma clase,para evitar merges innecesarios. si sucede, ponerse en contacto y usar algun programa para el merge(araxis merge,winmerge, etc)
3º despues de hacer las modificaciones de codigo, desde Lomboz hacer Team->Syncronize with repository . Veremos la vista de Team Synchronizing:
3a) hacer commit del codigo modificado(flecha gris)
3b)hacer update de aquello que se nos marque como modificado (flecha azul)
3c)Si existen conflictos (flecha roja), ver paso 2.

Si todo ha ido bien despues de hacer estos pasos tendremos el proyecto totalmente actualizado y los demas podrán ver nuestros cambios y probarlos
