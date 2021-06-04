$(document).ready(function() {


    
$('#list').DataTable( {
		"language": {
   		"url": "//cdn.datatables.net/plug-ins/3cfcc339e89/i18n/Japanese.json"
  		},
		
        "dom": "lf"+"<'row'<'col-sm-6'B>>"+"trip",
        "searching":true,
        "paging":true,
        "order":[[1,"desc"]],
        "ordering":true,
        "columnDefa":[{
        	"targets":[3],
        	"orderable":false
        }]
        
    } );
   
} );