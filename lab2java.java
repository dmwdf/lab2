$.ajax
    
    url: 'http://api.wunderground.com/api/36b799dc821d5836/conditions/q/'+adf'.json'
    
    dataType: 'jsonp'
    data: 'url'
    success: (data) ->
        for index, result of data
                temp = Math.round result.temp_f
                icon = result.icon_url
                weather = result.weather
                $('p.currentConditions').html "Now the Temperature is #{temp} &deg; F and #{weather}"
                $('div.currentIcon').html "<img src='#{icon}' >"