// jQuery se abrevia como $(...)
jQuery(document).ready(function() {

    jQuery("section").append("<div><p> LEYENDA LO QUE SEA</p></div>");   
    $(".articulo").append("<p>UN PARRAFO EN CADA ELEM con class = 'articulo'");
    
    $("tr").append("<td>Info<td/>"); //Añadir quinta columna
    $("td:nth-child(5)").attr("style","background-color: red; color: white");
    $("td:nth-child(5)").click(() => { 
        alert('un click desde jQ') 
    }); 
    $("#otro_menu").html("<h2>Menu de articulos</h2><br/><br/>");
    
    // $("article");
    // $("#otro_menu").append("<a> href='' class=''><a/>");

    // $("article").each( function(index) {
    //     let idArticulo = "articulo_21543"+ index;
    //     $(this).attr("id", idArticulo);
    //     $("#otro_menu").append("<a" /*href='#" +idArticulo + +"'*/ + " class='enlace-articulo'> Articulo nº " + index + "</a>");

    //     $("#enlace_" + idArticulo).click(function(){
    //         $(articuloActivo).slideUp(800);
    //         $("#" + idArticulo).slideDown(1500);
    //         articuloActivo = $("#" + idArticulo);
    //     });

    // });

    // var articuloActivo;

    // $("article").hide();

    // $("#otro_menu").children("a").each(function(index){
    //     $(this).click(function (evento) {
    //         //$("#articulo_21543" + index).slideToggle();
    //         $("article").hide();
            
    //         if($("#articulo_21543" + index).css('display') === 'none'){
    //             $("#articulo_21543" + index).show("fast");
    //         }
    //         else if($("#articulo_21543" + index).css('display') !== 'none'){
    //             $("#articulo_21543" + index).hide("slow");
    //         } 
            
    //         if($("#articulo_21543" + index).css('display') === 'block'){
    //             $("#articulo_21543" + index).css('display') = 'inline';
    //         }
    //     });
    // });


    // $("#otro_menu").click(function (evento) { 
    //     //$("#otro_menu").fadeOut();
    //     if($("#" + idArticulo).css('display') === 'none'){
    //         $("#" + idArticulo).show("slow");
    //     }else if($("#" + idArticulo).css('display') !== 'none'){
    //         $("#" + idArticulo).hide("slow");
    //     } 
        
    //     if($("#" + idArticulo).css('display') === 'block'){
    //         $("#" + idArticulo).css('display') = 'inline';
    //     }
    // });

    // $("#otro_menu").click(function (evento) { 
    //     //$("#otro_menu").fadeOut();
    //     if($(".articulo").css('display') === 'none'){
    //         $(".articulo").show("slow");
    //     }else if($(".articulo").css('display') !== 'none'){
    //         $(".articulo").hide("slow");
    //     } 
        
    //     if($(".articulo").css('display') === 'block'){
    //         $(".articulo").css('display') = 'inline';
    //     }
    // });



});

