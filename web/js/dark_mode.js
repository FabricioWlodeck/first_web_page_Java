$('.checkbox').click(function(){
    if($('input.checkbox').is(':checked')){
        $('.theme').attr('href', 'sb-admin-2.min_dark.css');
    }else{
        $('.theme').attr('href', 'sb-admin-2.min.css');
    }
})