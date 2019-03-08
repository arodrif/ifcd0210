$('#zoom-in').click(function() {
   		updtZoom(0.1);
	});

	$('#zoom-out').click(function() {
   		updtZoom(-0.1);
	});

	zoomLvl = 1;

	var updtZoom = function(zoom) {
   		zoomLvl += zoom;
   $('body').css({ zoom: zoomLvl, '-moz-transform': 'scale(' + zoomLvl + ')' });
	}

 