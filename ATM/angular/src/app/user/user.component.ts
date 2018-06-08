import { Component, OnInit, OnDestroy } from '@angular/core';
import { DataServiceService } from '../shared-service/data-service.service';
import { Observable } from 'rxjs/Observable';
import 'rxjs/Rx';
import { Subscription } from 'rxjs/Rx';

@Component({
	selector: 'app-user',
	templateUrl: './user.component.html',
	styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit, OnDestroy {
	userdata: any = [];
	numberObservableSubscription: Subscription;

	constructor(public ds: DataServiceService) { }

	ngOnInit() {

		this.ds.getData("secured/users").subscribe((data: Response) => {
			console.log(data);
			this.userdata = data['data'];
		});

		const myNumbers = Observable.interval(1000);
		this.numberObservableSubscription = myNumbers.subscribe(
			(number: number) => {
				console.log(number);
			});

	}

	ngOnDestroy() {
		this.numberObservableSubscription.unsubscribe();
	}

}
